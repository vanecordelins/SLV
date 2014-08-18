package br.com.slv.motorista;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.slv.setor.Setor;

public class MotoristaDAO implements IMotoristaDAO {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarMotorista(Motorista motorista) {

		this.sessao.save(motorista);

	}

	@Override
	public void altualizarMotorista(Motorista motorista) {

		this.sessao.update(motorista);

	}

	@Override
	public void excluirMotorista(Motorista motorista) {

		this.sessao.delete(motorista);

	}

	@Override
	public Motorista buscaMotorista(String cpf) {

		String hql = "select m from Motorista m where cpf = :cpf";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("cpf", cpf);

		return (Motorista) consulta.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Motorista> listarMotoristas() {

		return this.sessao.createCriteria(Motorista.class).list();

	}
}
