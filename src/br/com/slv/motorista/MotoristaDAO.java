package br.com.slv.motorista;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.util.HibernateUtil;

public class MotoristaDAO implements IMotoristaDAO {

	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarMotorista(Motorista motorista) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(motorista);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível inserir o motorista. Erro: "
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
	public void altualizarMotorista(Motorista motorista) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(motorista);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("não foi posível alterar o motorista. Erro: "
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
	public void excluirMotorista(Motorista motorista) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(motorista);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível excluir o motorista. Erro: "
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
	public Motorista buscaMotorista(String cpf) {

		Motorista motorista = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao
					.createCriteria(Motorista.class);
			filtro.add(Restrictions.eq("motorista", cpf));
			motorista = (Motorista) filtro.uniqueResult();
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

		return motorista;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Motorista> listarMotoristas() {

		List<Motorista> motoristas = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao
					.createCriteria(Motorista.class);
			motoristas = filtro.list();
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

		return motoristas;

	}
}
