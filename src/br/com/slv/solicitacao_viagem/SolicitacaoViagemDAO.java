package br.com.slv.solicitacao_viagem;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.slv.setor.Setor;
import br.com.slv.util.HibernateUtil;

public class SolicitacaoViagemDAO implements ISolicitacaoViagem {

	private Session sessao;
	private Transaction transacao;

	@Override
	public void salvarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.save(solicitacaoViagem);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível inserir o solicitacao de Viagem. Erro: "
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
	public void altualizarSolicitacaoViagem(SolicitacaoViagem solicitacaoViagem) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.update(solicitacaoViagem);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("não foi posível alterar o solicitacao de viagem. Erro: "
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
	public void excluirSolicitacaoViagem(SolicitacaoViagem solicitacao) {

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			this.sessao.delete(solicitacao);
			this.transacao.commit();

		} catch (HibernateException e) {

			System.out
					.println("Não foi possível excluir o solicitacao de viagem. Erro: "
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
	public SolicitacaoViagem buscaSolicitacaoViagem(String protocolo) {

		SolicitacaoViagem solicitacaoViagem = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao.createCriteria(Setor.class);
			filtro.add(Restrictions.eq("solicitacaoViagem", protocolo));
			solicitacaoViagem = (SolicitacaoViagem) filtro.uniqueResult();
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

		return solicitacaoViagem;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SolicitacaoViagem> listarSolicitacaoViagem() {

		List<SolicitacaoViagem> solicitacoes = null;

		try {

			this.sessao = HibernateUtil.getSessionFactory().getCurrentSession();
			this.transacao = this.sessao.beginTransaction();
			Criteria filtro = this.sessao
					.createCriteria(SolicitacaoViagem.class);
			solicitacoes = filtro.list();
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

		return solicitacoes;

	}

}
