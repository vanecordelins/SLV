package br.com.slv.app.connection;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.usuario.Usuario;
import br.com.slv.usuario.UsuarioDAO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe responsável por prover a autenticação do usuário via dispositivos
 * mobile.
 * @author lucianoserafim
 * @author ramonsantos.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginServlet() {

        super();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.tratarRequisicao(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.tratarRequisicao(request, response);

    }

    private void tratarRequisicao(HttpServletRequest request, HttpServletResponse response) {

        String senha = request.getParameter("senha");
        String cpfLogin = request.getParameter("cpfLogin");
        Usuario u;

        try {

            u = UsuarioDAO.getInstanceUsuarioDAO().logarUsuario(cpfLogin, senha);

            PrintWriter writer = response.getWriter();
            writer.print(u);
            writer.flush();
            writer.close();

        } catch (SenhaUsuarioIncorretaException ex1) {

        } catch (UsuarioInexistenteException ex2) {

        } catch (IOException ex3) {

        }

    }

}
