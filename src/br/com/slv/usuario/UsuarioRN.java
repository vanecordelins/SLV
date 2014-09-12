package br.com.slv.usuario;

import br.com.slv.util.DAOFactory;

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {

		this.usuarioDAO = DAOFactory.criarUsuarioDAO();

	}

	public boolean salvarUsuarioRN(Usuario usuario) {

		if (this.usuarioDAO.buscarUsuarioDAO(usuario.getCpf()) == null) {

			this.usuarioDAO.salvarUsuarioDAO(usuario);

			return true;

		} else {

			return false;

		}
		
	}

	public Usuario buscarUsuarioRN(String cpf) {

		return this.usuarioDAO.buscarUsuarioDAO(cpf);

	}

	public void atualizarUsuarioRN(Usuario usuario) {

		this.usuarioDAO.altualizarUsuarioDAO(usuario);

	}

}
