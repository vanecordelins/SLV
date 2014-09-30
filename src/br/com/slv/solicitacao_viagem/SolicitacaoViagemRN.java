package br.com.slv.solicitacao_viagem;

import br.com.slv.util.DAOFactory;
import br.com.slv.utilidades.Util;

public class SolicitacaoViagemRN {

	private SolicitacaoViagemDAO solicitacaoViagemDAO;

	Util gerar = Util.getInstancia();

	String protocolo;

	public SolicitacaoViagemRN() {

		this.solicitacaoViagemDAO = DAOFactory.criarSolicitacaoViagemDAO();

	}

	public boolean salvarSolicitacaoViagemRN(SolicitacaoViagem solicitacaoViagem) {

		if (this.solicitacaoViagemDAO
				.buscarSolicitacaoViagemDAO(this.protocolo = this.gerar
						.geraProtocolo()) != null) {

			this.salvarSolicitacaoViagemRN(solicitacaoViagem);

		} else {

			solicitacaoViagem.setProtocolo(this.protocolo);

			this.solicitacaoViagemDAO
					.salvarSolicitacaoViagemDAO(solicitacaoViagem);

			return true;

		}

		return false;

	}
}
