package br.com.slv.veiculo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class VeiculoDAO implements IVeiculoDAO {

	private Session sessao;
	
	public void setSession(Session session){
		this.sessao = session;
	}

	@Override
	public void salvarVeiculo(Veiculo veiculo) {
		
		this.sessao.save(veiculo);
		
	}

	@Override
	public void altualizarVeiculo(Veiculo veiculo) {
		
		this.sessao.update(veiculo);
		
	}

	@Override
	public void excluirVeiculo(Veiculo veiculo) {
		
		this.sessao.delete(veiculo);
		
	}

	@Override
	public Veiculo buscarVeiculo(String tombamento) {
		
		String hql = "select v from Veiculo v where v.tombamento=:tombamento";
		Query consulta = this.sessao.createQuery(hql);
		consulta.setParameter("tombamento", tombamento);

		return (Veiculo) consulta.uniqueResult();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Veiculo> listarVeiculos() {
		
		List<Veiculo> veiculos;
		
		Criteria filtro = this.sessao.createCriteria(Veiculo.class);
		veiculos = filtro.list();

		return veiculos;
		
	}
}
