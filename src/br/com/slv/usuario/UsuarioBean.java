package br.com.slv.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorRN;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	private String confirmarSenha, nomeSetor;

	private List<SelectItem> setoresSelect;

	public String salvar() {

		if (!this.usuario.getSenha().equals(this.confirmarSenha)) {

			return "usuario";

		} else {

			UsuarioRN usuarioRN = new UsuarioRN();

			SetorRN setorRN = new SetorRN();

			Setor setor = new Setor();

			setor = setorRN.buscarSetor(nomeSetor);

			this.usuario.setSetorAlocado(setor);

			Boolean salvo = usuarioRN.salvar(this.usuario);

			if (salvo.equals(false)) {

				return "usuario";

			} else {

				setor.getListaUsuarios().add(usuario);

				return "sucesso";

			}
		}
	}

	public List<SelectItem> getSetoresSelect() {

		if (this.setoresSelect == null) {

			setoresSelect = new ArrayList<SelectItem>();

			SetorRN setorRN = new SetorRN();

			List<Setor> listaSetores = setorRN.listarSetores();

			if (listaSetores != null && !listaSetores.isEmpty()) {

				SelectItem item;

				for (Setor setorLista : listaSetores) {

					item = new SelectItem(setorLista.getNome());

					this.setoresSelect.add(item);

				}
			}
		}

		return setoresSelect;

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

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
}
