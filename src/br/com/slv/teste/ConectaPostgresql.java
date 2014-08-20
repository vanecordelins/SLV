package br.com.slv.teste;

import java.util.List;

import org.hibernate.Session;

import br.com.slv.setor.Setor;
import br.com.slv.setor.SetorDAO;
import br.com.slv.util.HibernateUtil;

public class ConectaPostgresql {

	public static void main(String[] args) {
		
		Session sessao = null;
		
		try {
			
			sessao = HibernateUtil.getSessionFactory().openSession();
			
			SetorDAO dao = new SetorDAO();
			
			List<Setor> lista = dao.listarSetores();
			
			for (Setor setor : lista) {
				System.out.println(setor.getNome());
			}
						
		} finally {
			
			sessao.close();
			
		}
	}

}
