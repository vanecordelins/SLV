package br.com.slv.usuario;

import br.com.slv.util.DAOFactory;

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {

		this.usuarioDAO = DAOFactory.criarUsuarioDAO();

	}

	public boolean salvar(Usuario usuario) {

		Usuario usuarioExiste = usuarioDAO.buscarUsuario(usuario.getCpf());

		if (usuarioExiste == null) {

			this.usuarioDAO.salvarUsuario(usuario);

			return true;

		} else {

			return false;

		}
	}
}
