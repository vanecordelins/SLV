package br.com.slv.setor;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.util.HibernateUtil;

public class SetorDAO implements ISetorDAO {

	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarSetor(Setor setor) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(setor);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível inserir o setor. Erro: "
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
	public void altualizarSetor(Setor setor) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(setor);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("não foi posível alterar o setor. Erro: "
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
	public void excluirSetor(Setor setor) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(setor);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out.println("Não foi possível excluir o setor. Erro: "
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
	public Setor buscaSetor(String nome) {

		Setor setor = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Setor.class);
			filtro.add(Restrictions.eq("setor", nome));
			setor = (Setor) filtro.uniqueResult();
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

		return setor;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Setor> listarSetores() {

		List<Setor> setores = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Setor.class);
			setores = filtro.list();
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

		return setores;

	}

}
