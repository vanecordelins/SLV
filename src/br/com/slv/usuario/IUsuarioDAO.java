package br.com.slv.usuario;

import java.util.List;

/**
 * @author luciano
 * @author ramonsantos
 */
public interface IUsuarioDAO {
	
	public void salvarUsuarioDAO(Usuario usuario);
	public void altualizarUsuarioDAO(Usuario usuario);
	public void excluirUsuario(Usuario usuario);
	public Usuario buscarUsuarioDAO(String cpf);
	public List<Usuario> listarUsuarios();

}
