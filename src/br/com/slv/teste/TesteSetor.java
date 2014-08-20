package br.com.slv.teste;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorDAO;
import br.com.slv.util.HibernateUtil;

public class TesteSetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		SetorDAO dao = new SetorDAO();
		
		List<Setor> setorLista = new ArrayList<Setor>();
		
		setorLista = dao.listarSetores();
		
		for (Setor setor : setorLista) {
			System.out.println(setor.getNome());
		}
		
	}

}
