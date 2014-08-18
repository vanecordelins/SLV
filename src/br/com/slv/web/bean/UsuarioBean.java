package br.com.slv.web.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorDAO;
import br.com.slv.usuario.Usuario;
import br.com.slv.usuario.UsuarioRN;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	private String confirmarSenha;

	public String salvar() {

		if (!this.usuario.getSenha().equals(this.confirmarSenha)) {

			return "usuario";

		} else {

			UsuarioRN usuarioRN = new UsuarioRN();

			Boolean salvo = usuarioRN.salvar(this.usuario);

			if (salvo.equals(false)) {

				return "usuario";

			} else {

				return "sucesso";

			}
		}
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
}
