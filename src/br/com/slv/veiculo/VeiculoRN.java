package br.com.slv.veiculo;

import br.com.slv.util.DAOFactory;

public class VeiculoRN {

	VeiculoDAO veiculoDAO;

	public VeiculoRN() {

		this.veiculoDAO = DAOFactory.criarVeiculoDAO();
	}

	public Boolean salvarVeiculoRN(Veiculo veiculo) {

		Veiculo veiculoExiste = veiculoDAO.buscarVeiculo(veiculo
				.getTombamento());

		if (veiculoExiste == null) {
			
			this.veiculoDAO.salvarVeiculo(veiculo);
			
			return true;
			
		} else {
			
			return false;
			
		}

	}

	public Veiculo buscarVeiculo(String tombamentoPequisa) {
		
		return this.veiculoDAO.buscarVeiculo(tombamentoPequisa);
		
	}

	public void atualizarVeiculoRN(Veiculo veiculo) {
		
		this.veiculoDAO.altualizarVeiculo(veiculo);
		
	}

}
