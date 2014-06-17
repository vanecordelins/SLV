package br.com.slv.exception;

/**
 *
 * @author ramonsantos
 */
public class SenhaUsuarioIncorretaException extends Exception {

    /**
     * Creates a new instance of <code>SenhaUsuarioIncorretaException</code>
     * without detail message.
     */
    public SenhaUsuarioIncorretaException() {
    }

    /**
     * Constructs an instance of <code>SenhaUsuarioIncorretaException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public SenhaUsuarioIncorretaException(String msg) {
        super(msg);
    }
}
