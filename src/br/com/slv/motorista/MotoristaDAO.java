package br.com.slv.motorista;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import br.com.slv.setor.Setor;

public class MotoristaDAO implements IMotoristaDAO {

	private Session sessao;

	public void setSession(Session session) {

		this.sessao = session;

	}

	@Override
	public void salvarMotoristaDAO(Motorista motorista) {

		this.sessao.save(motorista);

	}

	@Override
	public void altualizarMotoristaDAO(Motorista motorista) {

		this.sessao.update(motorista);

	}

	@Override
	public void excluirMotorista(Motorista motorista) {

		this.sessao.delete(motorista);

	}

	@Override
	public Motorista buscarMotoristaDAO(String cpf) {

		String hql = "select m from Motorista m where cpf = :cpf";
		
		Query consulta = this.sessao.createQuery(hql);
		
		consulta.setParameter("cpf", cpf);

		return (Motorista) consulta.uniqueResult();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Motorista> listarMotoristas() {
		
		List<Motorista> motoristas = null;
		
		Criteria filtro = this.sessao.createCriteria(Motorista.class);
		
		motoristas = filtro.list();

		return motoristas;

	}
}
