package br.com.slv.motorista;

import br.com.slv.util.DAOFactory;

public class MotoristaRN {

	private MotoristaDAO motoristaDAO;

	public MotoristaRN() {

		this.motoristaDAO = DAOFactory.criarMotoristaDAO();

	}

	public Boolean salvar(Motorista motorista) {

		Motorista motoristaExiste = motoristaDAO.buscarMotorista(motorista
				.getCpf());

		if (motoristaExiste == null) {

			this.motoristaDAO.salvarMotorista(motorista);

			return true;

		} else {

			return false;

		}

	}

}
