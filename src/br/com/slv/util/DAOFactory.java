package br.com.slv.util;

import br.com.slv.motorista.MotoristaDAO;
import br.com.slv.setor.SetorDAO;
import br.com.slv.usuario.UsuarioDAO;
import br.com.slv.veiculo.VeiculoDAO;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {

		UsuarioDAO usuarioDAO = new UsuarioDAO();

		usuarioDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());

		return usuarioDAO;

	}

	public static SetorDAO criarSetorDAO() {

		SetorDAO setorDAO = new SetorDAO();

		setorDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());

		return setorDAO;

	}

	public static MotoristaDAO criarMotoristaDAO() {

		MotoristaDAO motoristaDAO = new MotoristaDAO();

		motoristaDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());

		return motoristaDAO;

	}

	public static VeiculoDAO criarVeiculoDAO() {

		VeiculoDAO veiculoDAO = new VeiculoDAO();

		veiculoDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());

		return veiculoDAO;

	}
}
