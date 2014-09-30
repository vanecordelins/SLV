package br.com.slv.solicitacao_viagem;

/**
 * @author luciano
 * @author Ramon
 */
public class SolicitacaoViagemBean {

	private SolicitacaoViagem solicitacaoViagem = new SolicitacaoViagem();

	SolicitacaoViagemRN solicitacaoViagemRN = new SolicitacaoViagemRN();

	public String salvarSolicitacaoViagemBean() {

		this.solicitacaoViagemRN
				.salvarSolicitacaoViagemRN(this.solicitacaoViagem);

		return null;

	}

	public SolicitacaoViagem getSolicitacaoViagem() {
		return solicitacaoViagem;
	}

	public void setSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {
		this.solicitacaoViagem = solicitacaoViagem;
	}
}
