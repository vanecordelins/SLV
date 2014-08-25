package br.com.slv.veiculo;

import br.com.slv.util.DAOFactory;

public class VeiculoRN {

	VeiculoDAO veiculoDAO;

	public VeiculoRN() {

		this.veiculoDAO = DAOFactory.criarVeiculoDAO();
	}

	public Boolean salvar(Veiculo veiculo) {

		Veiculo veiculoExiste = veiculoDAO.buscarVeiculo(veiculo
				.getTombamento());

		if (veiculoExiste == null) {
			
			this.veiculoDAO.salvarVeiculo(veiculo);
			
			return true;
			
		} else {
			
			return false;
			
		}

	}

}
