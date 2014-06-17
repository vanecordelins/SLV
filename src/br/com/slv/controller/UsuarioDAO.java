package br.com.slv.controller;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.model.Usuario;

public class UsuarioDAO implements IUsuarioDAO{

    public static UsuarioDAO getInstanceUsuarioDAO(){
        return null;
    }
    
    @Override
    public Usuario logarUsuario(String cpf, String senha) throws 
            SenhaUsuarioIncorretaException, UsuarioInexistenteException{
       
        return null;
        
    }

}
