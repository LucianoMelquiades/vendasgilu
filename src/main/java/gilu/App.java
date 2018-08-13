package gilu;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import gilu.model.Produto;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
	
		Produto v = new Produto();
		
		
		
		
	
		
		manager.persist(v);
		
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
