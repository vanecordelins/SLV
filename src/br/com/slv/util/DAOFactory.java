package br.com.slv.util;

import br.com.slv.usuario.UsuarioDAO;

public class DAOFactory {
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return usuarioDAO;
	}
}
