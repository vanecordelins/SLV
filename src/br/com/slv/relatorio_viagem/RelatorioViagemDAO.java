package br.com.slv.relatorio_viagem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.util.HibernateUtil;

public class RelatorioViagemDAO implements IRelatorioViagem {

	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarRelatorioViagem(RelatorioViagem relatorioViagem) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(relatorioViagem);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível inserir o relatório de Viagem. Erro: "
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
	public void altualizarRelatorioViagem(RelatorioViagem relatorioViagem) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(relatorioViagem);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("não foi posível alterar o relatório de viagem. Erro: "
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
	public void excluirRelatorioViagem(RelatorioViagem relatorioViagem) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(relatorioViagem);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível excluir o relatório de viagem. Erro: "
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
	public RelatorioViagem buscaRelatorioViagem(String protocolo) {

		RelatorioViagem relatorioViagem = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao
					.createCriteria(RelatorioViagem.class);
			filtro.add(Restrictions.eq("relatorioViagem", protocolo));
			relatorioViagem = (RelatorioViagem) filtro.uniqueResult();
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

		return relatorioViagem;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RelatorioViagem> listarRelatorioViagem() {

		List<RelatorioViagem> relatorioViagem = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao
					.createCriteria(RelatorioViagem.class);
			relatorioViagem = filtro.list();
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

		return relatorioViagem;

	}
}
