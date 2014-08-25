package br.com.slv.veiculo;

import java.util.List;


public interface IVeiculoDAO {
	public void salvarVeiculo(Veiculo veiculo);
	public void altualizarVeiculo(Veiculo veiculo);
	public void excluirVeiculo(Veiculo veiculo);
	public Veiculo buscarVeiculo(String tombamento);
	public List<Veiculo> listarVeiculos();
}
