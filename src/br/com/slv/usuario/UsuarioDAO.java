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
import br.com.slv.veiculo.Veiculo;

public class UsuarioDAO implements IUsuarioDAO{
	

	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarVeiculo(Veiculo veiculo) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(veiculo);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível inserir o veiculo. Erro: "
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
	public void altualizarVeiculo(Veiculo veiculo) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(veiculo);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("não foi posível alterar o veiculo. Erro: "
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
	public void excluirVeiculo(Veiculo veiculo) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(veiculo);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível excluir o veiculo. Erro: "
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
	public Veiculo buscaVeiculo(String tombamento) {

		Veiculo veiculo = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Veiculo.class);
			filtro.add(Restrictions.eq("categoria", tombamento));
			veiculo = (Veiculo) filtro.uniqueResult();
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

		return veiculo;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Veiculo> listarVeiculos() {

		List<Veiculo> veiculos = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Veiculo.class);
			veiculos = filtro.list();
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

		return veiculos;

	}
	
    @Override
    public Usuario logarUsuario(String cpf, String senha) throws 
            SenhaUsuarioIncorretaException, UsuarioInexistenteException{
       
        return null;
        
    }

	public static UsuarioDAO getInstanceUsuarioDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
