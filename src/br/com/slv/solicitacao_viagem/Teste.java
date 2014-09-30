package br.com.slv.solicitacao_viagem;

import br.com.slv.utilidades.Util;

public class Teste {

	public static void main(String[] args) {
		
		SolicitacaoViagemRN s = new SolicitacaoViagemRN();
		
		Util u = Util.getInstancia();
		
		String a = u.geraProtocolo();
		
		System.out.println(a);

	}

}