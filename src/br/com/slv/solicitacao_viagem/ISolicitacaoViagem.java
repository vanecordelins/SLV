package br.com.slv.solicitacao_viagem;

import java.util.List;

public interface ISolicitacaoViagem {
	public void salvarSolicitacaoViagemDAO(SolicitacaoViagem solicitacaoViagem);
	public void altualizarSolicitacaoViagemDAO(SolicitacaoViagem solicitacaoViagem);
	public void excluirSolicitacaoViagemDAO(SolicitacaoViagem solicitacaoViagem);
	public SolicitacaoViagem buscarSolicitacaoViagemDAO(String protocolo);
	public List<SolicitacaoViagem> listarSolicitacaoViagemDAO();
}
