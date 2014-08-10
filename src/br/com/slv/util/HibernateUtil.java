package br.com.slv.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            return cfg.buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("Criação inicial o objeto SessionFactory falhou. Erro: " + e);
            throw new ExceptionInInitializerError(e);
        }        
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
