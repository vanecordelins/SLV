package br.com.slv.setor;

import java.util.List;

import br.com.slv.util.DAOFactory;

public class SetorRN {

	private SetorDAO setorDAO;

	public SetorRN() {

		this.setorDAO = DAOFactory.criarSetorDAO();

	}

	public boolean salvarSetorRN(Setor setor) {

		Setor setorExiste = setorDAO.buscarSetorDAO(setor.getNome());

		if (setorExiste == null) {

			this.setorDAO.salvarSetor(setor);

			return true;

		} else {

			return false;

		}
	}

	public Setor buscarSetorRN(String nomeSetor) {
		
		return this.setorDAO.buscarSetorDAO(nomeSetor);
		
	}

	public List<Setor> listarSetoresRN() {
		
		return this.setorDAO.listarSetoresDAO();
		
	}

	public void atualizarSetorRN(Setor setor) {
		
		this.setorDAO.altualizarSetorDAO(setor);
		
	}
}
