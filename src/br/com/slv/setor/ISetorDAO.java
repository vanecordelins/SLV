package br.com.slv.setor;

import java.util.List;

public interface ISetorDAO {
	public void salvarSetor(Setor setor);
	public void altualizarSetorDAO(Setor setor);
	public void excluirSetor(Setor setor);
	public Setor buscarSetorDAO(String nome);
	public List<Setor> listarSetoresDAO();
}
