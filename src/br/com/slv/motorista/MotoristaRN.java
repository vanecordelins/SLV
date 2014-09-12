package br.com.slv.motorista;

import br.com.slv.util.DAOFactory;

public class MotoristaRN {

	private MotoristaDAO motoristaDAO;

	public MotoristaRN() {

		this.motoristaDAO = DAOFactory.criarMotoristaDAO();

	}

	public Boolean salvarMotoristaRN(Motorista motorista) {

		if (this.motoristaDAO.buscarMotoristaDAO(motorista.getCpf()) == null) {

			this.motoristaDAO.salvarMotoristaDAO(motorista);

			return true;

		} else {

			return false;

		}

	}

	public Motorista buscarMotoristaRN(String cpfPesquisa) {

		return this.motoristaDAO.buscarMotoristaDAO(cpfPesquisa);

	}

	public void atualizarMotoristaRN(Motorista motorista) {
		
		this.motoristaDAO.altualizarMotoristaDAO(motorista);
		
	}

}
