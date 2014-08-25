package br.com.slv.usuario;

import java.util.List;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.setor.Setor;

/**
 * @author luciano
 * @author ramonsantos
 */
public interface IUsuarioDAO {
	
	public void salvarUsuario(Usuario usuario);
	public void altualizarUsuario(Usuario usuario);
	public void excluirUsuario(Usuario usuario);
	public Usuario buscarUsuario(String cpf);
	public List<Usuario> listarUsuarios();

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
