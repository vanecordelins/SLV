package br.com.slv.relatorio_viagem;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.slv.setor.Setor;

public class RelatorioViagemDAO implements IRelatorioViagem {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarRelatorioViagem(RelatorioViagem relatorioViagem) {

		this.sessao.save(relatorioViagem);

	}

	@Override
	public void altualizarRelatorioViagem(RelatorioViagem relatorioViagem) {

		this.sessao.update(relatorioViagem);

	}

	@Override
	public void excluirRelatorioViagem(RelatorioViagem relatorioViagem) {

		this.sessao.delete(relatorioViagem);

	}

	@Override
	public RelatorioViagem buscaRelatorioViagem(String protocolo) {

		String hql = "select r from RelatorioViagem r where r.protocolo=:protocolo";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("protocolo", protocolo);

		return (RelatorioViagem) consulta.uniqueResult();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RelatorioViagem> listarRelatorioViagem() {

		return this.sessao.createCriteria(RelatorioViagem.class).list();

	}

}
