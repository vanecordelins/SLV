package br.com.slv.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorRN;
import br.com.slv.singleton.Util;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	UsuarioRN usuarioRN = new UsuarioRN();

	SetorRN setorRN = new SetorRN();
	
	Util cpf = Util.getInstancia();

	FacesContext context = FacesContext.getCurrentInstance();

	private String confirmarSenha;
	private String cpfPesquisa;
	private List<SelectItem> setoresSelect;

	public String salvarUsuarioBean() {

		if (!this.usuario.getSenha().equals(this.confirmarSenha)) {

			FacesMessage facesMessage = new FacesMessage(
					"A senha informada não confere");

			context.addMessage("usuario:confirmarSenha", facesMessage);

			return null;

		} else if (this.cpf.isCpf(usuario.getCpf()) == false) {

			FacesMessage facesMessage = new FacesMessage("CPF inválido");

			context.addMessage("usuario:cpf", facesMessage);

			return null;

		} else if (this.usuarioRN.salvarUsuarioRN(this.usuario) == false) {

			FacesMessage facesMessage = new FacesMessage(
					"Usuário já está cadastrado no sistema");

			context.addMessage(null, facesMessage);

			return null;

		} else {

			return "sucesso";

		}
	}

	public String atualizarUsuarioBean() {

		if (!this.usuario.getSenha().equals(this.confirmarSenha)) {

			FacesMessage facesMessage = new FacesMessage(
					"A senha informada não confere");

			context.addMessage("usuario:confirmarSenha", facesMessage);

			return null;

		} else if (this.cpf.isCpf(usuario.getCpf()) == false) {

			FacesMessage facesMessage = new FacesMessage("CPF inválido");

			context.addMessage("usuario:cpf", facesMessage);

			return null;

		} else {

			this.usuarioRN.atualizarUsuarioRN(usuario);

			return "sucesso";

		}
	}

	public List<SelectItem> getSetoresSelect() {

		if (this.setoresSelect == null) {

			this.setoresSelect = new ArrayList<SelectItem>();

			List<Setor> listaSetores = this.setorRN.listarSetoresRN();

			if (listaSetores != null && !listaSetores.isEmpty()) {

				SelectItem item;

				for (Setor setorLista : listaSetores) {

					item = new SelectItem(setorLista, setorLista.getNome());

					this.setoresSelect.add(item);

				}
			}
		}

		return setoresSelect;

	}

	public String pesquisarUsuarioBean() {

		this.usuario = this.usuarioRN.buscarUsuarioRN(cpfPesquisa);

		if (usuario == null) {

			FacesMessage facesMessage = new FacesMessage(
					"O usuário não está cadastrado");

			context.addMessage(null, facesMessage);

			return null;

		}

		return "atualizar_usuario";

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String getCpfPesquisa() {
		return cpfPesquisa;
	}

	public void setCpfPesquisa(String cpfPesquisa) {
		this.cpfPesquisa = cpfPesquisa;
	}
}
