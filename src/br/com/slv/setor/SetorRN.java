package br.com.slv.setor;

import java.util.List;

import br.com.slv.util.DAOFactory;

public class SetorRN {

	private SetorDAO setorDAO;

	public SetorRN() {

		this.setorDAO = DAOFactory.criarSetorDAO();

	}

	public boolean salvar(Setor setor) {

		Setor setorExiste = setorDAO.buscarSetor(setor.getNome());

		if (setorExiste == null) {

			this.setorDAO.salvarSetor(setor);

			return true;

		} else {

			return false;

		}
	}

	public Setor buscarSetor(String nomeSetor) {
		
		return this.setorDAO.buscarSetor(nomeSetor);
		
	}

	public List<Setor> listarSetores() {
		
		return this.setorDAO.listarSetores();
		
	}

	public void atualizarSetor(Setor setor) {
		
		this.setorDAO.altualizarSetor(setor);
		
	}
}
