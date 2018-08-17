package gilu;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import gilu.model.Carrinho;
import gilu.model.Pedido;
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
		p.setTipoPagamento(TipoPagamento.CARTAO);
	
		manager.persist(p);
		
		Carrinho c = new Carrinho();
		c.setData( new java.util.Date());
		c.setQuantidade(10);
		c.setValor(BigDecimal.valueOf(100) );
		
		manager.persist(c);
		
		
		Pedido pe = new Pedido();
		pe.setCodigo(01);
		pe.setNome("Livro");
		pe.setPreco(BigDecimal.valueOf(20));
		pe.setQnt(20);
		pe.setDataEntrega(new java.util.Date());
		
		manager.persist(pe);
		
		
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
