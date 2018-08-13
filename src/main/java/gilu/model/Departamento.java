package gilu.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String eletronico;
	private String livros; 
	private String ferramentas;
	private String videoGames; 
	private String acessorios;
	private String pepelaria;
	
	
	public Departamento(){
		
	}


	public Departamento(String eletronico, String livros, String ferramentas, String videoGames, String acessorios,
			String pepelaria) {
		super();
		this.eletronico = eletronico;
		this.livros = livros;
		this.ferramentas = ferramentas;
		this.videoGames = videoGames;
		this.acessorios = acessorios;
		this.pepelaria = pepelaria;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEletronico() {
		return eletronico;
	}


	public void setEletronico(String eletronico) {
		this.eletronico = eletronico;
	}


	public String getLivros() {
		return livros;
	}


	public void setLivros(String livros) {
		this.livros = livros;
	}


	public String getFerramentas() {
		return ferramentas;
	}


	public void setFerramentas(String ferramentas) {
		this.ferramentas = ferramentas;
	}


	public String getVideoGames() {
		return videoGames;
	}


	public void setVideoGames(String videoGames) {
		this.videoGames = videoGames;
	}


	public String getAcessorios() {
		return acessorios;
	}


	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}


	public String getPepelaria() {
		return pepelaria;
	}


	public void setPepelaria(String pepelaria) {
		this.pepelaria = pepelaria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acessorios == null) ? 0 : acessorios.hashCode());
		result = prime * result + ((eletronico == null) ? 0 : eletronico.hashCode());
		result = prime * result + ((ferramentas == null) ? 0 : ferramentas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((livros == null) ? 0 : livros.hashCode());
		result = prime * result + ((pepelaria == null) ? 0 : pepelaria.hashCode());
		result = prime * result + ((videoGames == null) ? 0 : videoGames.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (acessorios == null) {
			if (other.acessorios != null)
				return false;
		} else if (!acessorios.equals(other.acessorios))
			return false;
		if (eletronico == null) {
			if (other.eletronico != null)
				return false;
		} else if (!eletronico.equals(other.eletronico))
			return false;
		if (ferramentas == null) {
			if (other.ferramentas != null)
				return false;
		} else if (!ferramentas.equals(other.ferramentas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (livros == null) {
			if (other.livros != null)
				return false;
		} else if (!livros.equals(other.livros))
			return false;
		if (pepelaria == null) {
			if (other.pepelaria != null)
				return false;
		} else if (!pepelaria.equals(other.pepelaria))
			return false;
		if (videoGames == null) {
			if (other.videoGames != null)
				return false;
		} else if (!videoGames.equals(other.videoGames))
			return false;
		return true;
	}
}
