package br.com.slv.usuario;

import br.com.slv.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN(){
		
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
		
	}
	
	public void salvar(Usuario usuario){
		
		Usuario retornoUsuario = usuarioDAO.buscaUsuario(usuario.getCpf());
		
		if(retornoUsuario == null){
			
			this.usuarioDAO.salvarUsuario(usuario);
			
		}else{
			
			this.usuarioDAO.altualizarUsuario(usuario);
			
		}
	}
}
