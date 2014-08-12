package br.com.slv.web.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.slv.usuario.Usuario;
import br.com.slv.usuario.UsuarioRN;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	String confirmaSenha;

	public String novo() {

		System.out.println("Passou");

		this.usuario = new Usuario();
		return "usuario";

	}

	public String salvar() {

		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();

		if (!senha.equals(this.confirmaSenha)) {

			FacesMessage facesMessage = new FacesMessage(
					"A senha informada não confere");
			context.addMessage(null, facesMessage);

			return null;
			
		} else {

			UsuarioRN usuarioRN = new UsuarioRN();

			usuarioRN.salvar(this.usuario);

			return "usuarioSucesso";
		}
	}

	public String login() {

		System.out.println("Passou");

		return "usuario";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
}
