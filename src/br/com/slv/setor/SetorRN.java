package br.com.slv.setor;

import br.com.slv.util.DAOFactory;

public class SetorRN {

	private SetorDAO setorDAO;

	public SetorRN() {

		this.setorDAO = DAOFactory.criarSetorDAO();

	}

	public void salvar(Setor setor) {
		
		Setor nomeSetor = setorDAO.buscaSetor(setor.getNome());

		if (nomeSetor == null) {

			this.setorDAO.salvarSetor(setor);

		} else {

			this.setorDAO.altualizarSetor(setor);

		}
	}
}
