package br.com.slv.solicitacao_viagem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.relatorio_viagem.RelatorioViagem;
import br.com.slv.setor.Setor;
import br.com.slv.usuario.Usuario;
import br.com.slv.util.HibernateUtil;

public class SolicitacaoViagemDAO implements ISolicitacaoViagem {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {

		this.sessao.save(solicitacaoViagem);

	}

	@Override
	public void altualizarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {
		
		this.sessao.update(solicitacaoViagem);
		
	}

	@Override
	public void excluirSolicitacaoViagem(SolicitacaoViagem solicitacao) {
		
		this.sessao.delete(solicitacao);
		
	}

	@Override
	public SolicitacaoViagem buscaSolicitacaoViagem(String protocolo) {

		String hql = "select s from SolicitacaoViagem s where s.protocolo=:protocolo";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("protocolo", protocolo);

		return (SolicitacaoViagem) consulta.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SolicitacaoViagem> listarSolicitacaoViagem() {
		
		return this.sessao.createCriteria(SolicitacaoViagem.class).list();

	}

}
