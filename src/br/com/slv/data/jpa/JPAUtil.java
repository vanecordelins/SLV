package br.com.slv.data.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe responsável por facilitar a forma de obter uma EntityManager.
 * @author ramonsantos
 */
public class JPAUtil {

    public static JPAUtil instanceJPAUtil;
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("UP-SLV");

    public EntityManager getEntityManager() {

        return entityManagerFactory.createEntityManager();

    }

    public static JPAUtil getInstanceUnidadePersistencia() {

        if (instanceJPAUtil == null) {

            instanceJPAUtil = new JPAUtil();

        }

        return instanceJPAUtil;

    }
    
}
