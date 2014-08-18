package br.com.slv.setor;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class SetorDAO implements ISetorDAO {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarSetor(Setor setor) {

		this.sessao.save(setor);

	}

	@Override
	public void altualizarSetor(Setor setor) {

		this.sessao.update(setor);

	}

	@Override
	public void excluirSetor(Setor setor) {

		this.sessao.update(setor);

	}

	@Override
	public Setor buscaSetor(String nome) {

		String hql = "select s from Setor s where s.nome = :nome";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("nome", nome);

		return (Setor) consulta.uniqueResult();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Setor> listarSetores() {

		return this.sessao.createCriteria(Setor.class).list();

	}

}
