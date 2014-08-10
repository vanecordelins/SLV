package br.com.slv.teste;

import org.hibernate.Session;

import br.com.slv.util.HibernateUtil;

public class ConectaPostgresql {

	public static void main(String[] args) {
		
		Session sessao = null;
		
		try {
			
			sessao = HibernateUtil.getSessionFactory().openSession();
						
		} finally {
			
			sessao.close();
			
		}
	}

}
