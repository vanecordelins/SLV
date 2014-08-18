package br.com.slv.usuario;

import java.util.List;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorDAO;
import br.com.slv.util.DAOFactory;

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {

		this.usuarioDAO = DAOFactory.criarUsuarioDAO();

	}

	public boolean salvar(Usuario usuario) {

		Usuario usuarioExiste = usuarioDAO.buscaUsuario(usuario.getCpf());

		if (usuarioExiste == null) {

			this.usuarioDAO.salvarUsuario(usuario);

			return true;

		} else {

			return false;

		}
	}
}
