package br.com.slv.setor;

import br.com.slv.util.DAOFactory;

public class SetorRN {

	private SetorDAO setorDAO;

	public SetorRN() {

		this.setorDAO = DAOFactory.criarSetorDAO();

	}

	public boolean salvar(Setor setor) {

		Setor setorExiste = setorDAO.buscaSetor(setor.getNome());

		if (setorExiste == null) {

			this.setorDAO.salvarSetor(setor);

			return true;

		} else {

			return false;

		}
	}

	public Setor buscaSetor(String nomeSetor) {
		
		return setorDAO.buscaSetor(nomeSetor);
		
	}
}
