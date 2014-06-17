package br.com.slv.exception;

/**
 *
 * @author ramonsantos
 */
public class UsuarioInexistenteException extends Exception {

    /**
     * Creates a new instance of <code>UsuarioInexistenteException</code>
     * without detail message.
     */
    public UsuarioInexistenteException() {
    }

    /**
     * Constructs an instance of <code>UsuarioInexistenteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public UsuarioInexistenteException(String msg) {
        super(msg);
    }
}
