package br.com.slv.usuario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;

public class UsuarioDAO implements IUsuarioDAO {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarUsuario(Usuario usuario) {

		this.sessao.save(usuario);

	}

	@Override
	public void altualizarUsuario(Usuario usuario) {

		this.sessao.update(usuario);

	}

	@Override
	public void excluirUsuario(Usuario usuario) {

		this.sessao.delete(usuario);

	}

	@Override
	public Usuario buscaUsuario(String cpf) {

		String hql = "select u from Usuario u where u.cpf=:cpf";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("cpf", cpf);

		return (Usuario) consulta.uniqueResult();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listarUsuarios() {

		return this.sessao.createCriteria(Usuario.class).list();

	}

	@Override
	public Usuario logarUsuario(String cpf, String senha)
			throws SenhaUsuarioIncorretaException, UsuarioInexistenteException {
		// TODO Auto-generated method stub
		return null;
	}

	public static UsuarioDAO getInstanceUsuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}
