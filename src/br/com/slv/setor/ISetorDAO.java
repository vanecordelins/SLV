package br.com.slv.setor;

import java.util.List;

public interface ISetorDAO {
	public void salvarSetor(Setor setor);
	public void altualizarSetor(Setor setor);
	public void excluirSetor(Setor setor);
	public Setor buscaSetor(String nome);
	public List<Setor> listarSetores();
}
