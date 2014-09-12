package br.com.slv.motorista;

import java.util.List;

public interface IMotoristaDAO {
	public void salvarMotoristaDAO(Motorista motorista);
	public void altualizarMotoristaDAO(Motorista motorista);
	public void excluirMotorista(Motorista motorista);
	public Motorista buscarMotoristaDAO(String cpf);
	public List<Motorista> listarMotoristas();
}
