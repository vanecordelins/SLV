package br.com.slv.usuario;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.exception.SenhaUsuarioIncorretaException;
import br.com.slv.exception.UsuarioInexistenteException;
import br.com.slv.util.HibernateUtil;

public class UsuarioDAO implements IUsuarioDAO{
	
	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarUsuario(Usuario usuario) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(usuario);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível inserir o usuario. Erro: "
					+ e.getMessage());

		} finally {

			try {

				if (this.sessao.isOpen()) {

					this.sessao.close();
				}

			} catch (Throwable e) {

				System.out
						.println("Erro ao fechar operação de inserção. Mensagem: "
								+ e.getMessage());

			}
		}
	}

	@Override
	public void altualizarUsuario(Usuario usuario) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(usuario);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("não foi posível alterar o usuario. Erro: "
					+ e.getMessage());

		} finally {

			try {

				if (this.sessao.isOpen()) {

					this.sessao.close();

				}

			} catch (Throwable e) {

				System.out
						.println("Erro ao fechar a operação de atualização. Mensagem: "
								+ e.getMessage());

			}
		}
	}

	@Override
	public void excluirUsuario(Usuario usuario) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(usuario);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível excluir o usuario. Erro: "
					+ e.getMessage());

		} finally {

			try {

				if (this.sessao.isOpen()) {

					this.sessao.close();

				}

			} catch (Throwable e) {

				System.out
						.println("Erro ao fechar operação de exclusão. Mensagem: "
								+ e.getMessage());

			}
		}
	}

	@Override
	public Usuario buscaUsuario(String cpf) {

		Usuario usuario = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Usuario.class);
			filtro.add(Restrictions.eq("usuario", cpf));
			usuario = (Usuario) filtro.uniqueResult();
			this.transacao.commit();

		} catch (Throwable e) {

			if (this.transacao.isActive()) {

				this.transacao.rollback();

			}

		} finally {

			try {

				if (this.sessao.isOpen()) {

					this.sessao.close();

				}

			} catch (Throwable e) {

				System.out
						.println("Erro ao fechar operação de busca. Mensagem: "
								+ e.getMessage());

			}
		}

		return usuario;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> listarUsuarios() {

		List<Usuario> usuarios = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Usuario.class);
			usuarios = filtro.list();
			this.transacao.commit();

		} catch (Throwable e) {

			if (this.transacao.isActive()) {

				this.transacao.rollback();

			}

		} finally {

			try {

				if (this.sessao.isOpen()) {

					this.sessao.close();

				}

			} catch (Throwable e) {

				System.out
						.println("Erro ao fecher a operação de listagem. Mensagem: "
								+ e.getMessage());

			}
		}

		return usuarios;

	}
	
	public static UsuarioDAO getInstanceUsuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
    public Usuario logarUsuario(String cpf, String senha) throws 
            SenhaUsuarioIncorretaException, UsuarioInexistenteException{
       
        return null;
        
    }

}
