package br.com.slv.motorista;

import java.util.List;

public interface IMotoristaDAO {
	public void salvarMotorista(Motorista motorista);
	public void altualizarMotorista(Motorista motorista);
	public void excluirMotorista(Motorista motorista);
	public Motorista buscarMotorista(String cpf);
	public List<Motorista> listarMotoristas();
}
