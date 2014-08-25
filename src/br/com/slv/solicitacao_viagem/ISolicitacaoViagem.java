package br.com.slv.solicitacao_viagem;

import java.util.List;

public interface ISolicitacaoViagem {
	public void salvarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem);
	public void altualizarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem);
	public void excluirSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem);
	public SolicitacaoViagem buscarSolicitacaoViagem(String protocolo);
	public List<SolicitacaoViagem> listarSolicitacaoViagem();
}
