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
	
		Produto produto = new Produto();
		produto.setNome("Livros");
		produto.setPreco(20d);
	
		manager.persist(produto);
		
		Carrinho carrinho = new Carrinho();
		carrinho.setDataCompra(new java.util.Date());
		carrinho.setQuantidade(10);
		carrinho.setValor(BigDecimal.valueOf(100) );
		carrinho.setTipoPagamento(TipoPagamento.CARTAO);
		
		manager.persist(carrinho);
		
		
		Usuario usuario = new Usuario();
		usuario.setNome("GISELE");
		usuario.setCpf(1347522);
		usuario.setEmail("Giselelarissa@gmail.com");
		usuario.setSenha("1234567890");
		
		manager.persist(usuario);
		
	
	    tx.commit();
		manager.close();
		JPAUtil.close();
    }
}
