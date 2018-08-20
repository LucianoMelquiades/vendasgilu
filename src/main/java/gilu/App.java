package gilu;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import gilu.model.Carrinho;
import gilu.model.Produto;
import gilu.model.TipoPagamento;
import gilu.model.Usuario;

public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
	
		Produto p = new Produto();
		p.setNome("Livros");
		p.setPreco(20d);
	
		manager.persist(p);
		
		Carrinho c = new Carrinho();
		c.setDataCompra(new java.util.Date());
		c.setQuantidade(10);
		c.setValor(BigDecimal.valueOf(100) );
		c.setTipoPagamento(TipoPagamento.CARTAO);
		
		manager.persist(c);
		
		
		Usuario u = new Usuario();
		u.setNome("GISELE");
		u.setCpf(1347522);
		u.setEmail("Giselelarissa@gmail.com");
		u.setSenha("1234567890");
		
		manager.persist(u);
		
	
	    tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
