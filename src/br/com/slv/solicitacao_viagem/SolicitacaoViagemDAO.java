package br.com.slv.solicitacao_viagem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class SolicitacaoViagemDAO implements ISolicitacaoViagem {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarSolicitacaoViagemDAO(SolicitacaoViagem solicitacaoViagem) {

		this.sessao.save(solicitacaoViagem);

	}

	@Override
	public void altualizarSolicitacaoViagemDAO(SolicitacaoViagem solicitacaoViagem) {
		
		this.sessao.update(solicitacaoViagem);
		
	}

	@Override
	public void excluirSolicitacaoViagemDAO(SolicitacaoViagem solicitacao) {
		
		this.sessao.delete(solicitacao);
		
	}

	@Override
	public SolicitacaoViagem buscarSolicitacaoViagemDAO(String protocolo) {

		String hql = "select s from SolicitacaoViagem s where s.protocolo=:protocolo";
		
		Query consulta = this.sessao.createQuery(hql);
		
		consulta.setParameter("protocolo", protocolo);

		return (SolicitacaoViagem) consulta.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SolicitacaoViagem> listarSolicitacaoViagemDAO() {
		
		List<SolicitacaoViagem> solicitacoesViagens = null;
		
		Criteria filtro = this.sessao.createCriteria(SolicitacaoViagem.class);
		
		solicitacoesViagens = filtro.list();
		
		return solicitacoesViagens;

	}

}
