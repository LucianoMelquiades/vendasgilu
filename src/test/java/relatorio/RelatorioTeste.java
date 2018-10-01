package relatorio;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.exemple.gilu.modelo.Produto;
import com.exemple.gilu.relatorio.Relatorio;



public class RelatorioTeste {
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemCrescente() {
		
		
		Produto celular = new Produto("Samsumg G", 250.0);
		Produto tv = new Produto("LG HD", 300.0);
		Produto dvd = new Produto("A galinha pintadinha V.10", 400.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
				
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemDecrescente() {
		
		
		Produto dvd = new Produto("A galinha pintadinha V.10", 400.0);
		Produto tv = new Produto("LG HD", 300.0);
		Produto celular = new Produto("Samsumg G", 250.0);
		
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(dvd);
		produtos.add(tv);
		produtos.add(celular);
		
		
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double menorPrecoEsperado = 250.0;
		Double maiorPrecoEsperado = 400.0;
		
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
		
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemAleatoria() {
		
		
		Produto tv = new Produto("LG HD", 300.0);
		Produto celular = new Produto("Samsumg G", 250.0);
		Produto dvd = new Produto("A galinha pintadinha V.10", 400.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(tv);
		produtos.add(celular);
		produtos.add(dvd);
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
		
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDeUmUnicoProduto() {
		
		
		Produto celular = new Produto("Samsumg G", 250.0);
		
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 250.0;
		Double menorPrecoEsperado = 250.0;
		
		assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
		
	}
	
	
	

}
