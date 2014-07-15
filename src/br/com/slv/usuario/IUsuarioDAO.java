package br.com.slv.usuario;

import java.util.List;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.veiculo.Veiculo;

/**
 * @author luciano
 * @author ramonsantos
 */
public interface IUsuarioDAO {
	
	public void salvarVeiculo(Veiculo veiculo);
	public void altualizarVeiculo(Veiculo veiculo);
	public void excluirVeiculo(Veiculo veiculo);
	public Veiculo buscaVeiculo(String tombamento);
	public List<Veiculo> listarVeiculos();

	/**
	 * 
	 * @param cpf
	 * @param senha
	 * @return
	 * @throws br.com.slv.exception.SenhaUsuarioIncorretaException
	 * @throws br.com.slv.exception.UsuarioInexistenteException
	 */
	public abstract Usuario logarUsuario(String cpf, String senha)
			throws SenhaUsuarioIncorretaException, UsuarioInexistenteException;

}
