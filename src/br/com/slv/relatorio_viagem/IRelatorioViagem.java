package br.com.slv.relatorio_viagem;

import java.util.List;

public interface IRelatorioViagem {
	public void salvarRelatorioViagem(RelatorioViagem relatorioViagem);
	public void altualizarRelatorioViagem(RelatorioViagem relatorioViagem);
	public void excluirRelatorioViagem(RelatorioViagem relatorioViagem);
	public RelatorioViagem buscaRelatorioViagem(String protocolo);
	public List<RelatorioViagem> listarRelatorioViagem();
}
