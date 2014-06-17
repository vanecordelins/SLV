package br.com.slv.controller;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.model.Usuario;

/**
 *
 * @author ramonsantos
 */
public interface IUsuarioDAO {

    /**
     *
     * @param cpf
     * @param senha
     * @return
     * @throws br.com.slv.exception.SenhaUsuarioIncorretaException
     * @throws br.com.slv.exception.UsuarioInexistenteException
     */
    public abstract Usuario logarUsuario(String cpf, String senha) throws
            SenhaUsuarioIncorretaException, UsuarioInexistenteException;

}
