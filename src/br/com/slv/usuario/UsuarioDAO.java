package br.com.slv.usuario;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDAO implements IUsuarioDAO {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarUsuarioDAO(Usuario usuario) {

		this.sessao.save(usuario);

	}

	@Override
	public void altualizarUsuarioDAO(Usuario usuario) {

		this.sessao.update(usuario);

	}

	@Override
	public void excluirUsuario(Usuario usuario) {

		this.sessao.delete(usuario);

	}

	@Override
	public Usuario buscarUsuarioDAO(String cpf) {

		String hql = "select u from Usuario u where u.cpf=:cpf";
		
		Query consulta = this.sessao.createQuery(hql);
		
		consulta.setParameter("cpf", cpf);

		return (Usuario) consulta.uniqueResult();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listarUsuarios() {
		
		List<Usuario> usuarios = null;

		Criteria filtro = this.sessao.createCriteria(Usuario.class);
		
		usuarios = filtro.list();

		return usuarios;

	}
}
