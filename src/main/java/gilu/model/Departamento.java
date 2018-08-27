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
	
	
	
	private String infantil;
	private String femenino; 
	private String masculino;
	
	
	public Departamento(){
		
	}


	public Departamento(Integer id, String infantil, String femenino, String masculino) {
		super();
		this.id = id;
		this.infantil = infantil;
		this.femenino = femenino;
		this.masculino = masculino;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getInfantil() {
		return infantil;
	}


	public void setInfantil(String infantil) {
		this.infantil = infantil;
	}


	public String getFemenino() {
		return femenino;
	}


	public void setFemenino(String femenino) {
		this.femenino = femenino;
	}


	public String getMasculino() {
		return masculino;
	}


	public void setMasculino(String masculino) {
		this.masculino = masculino;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((femenino == null) ? 0 : femenino.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((infantil == null) ? 0 : infantil.hashCode());
		result = prime * result + ((masculino == null) ? 0 : masculino.hashCode());
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
		if (femenino == null) {
			if (other.femenino != null)
				return false;
		} else if (!femenino.equals(other.femenino))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (infantil == null) {
			if (other.infantil != null)
				return false;
		} else if (!infantil.equals(other.infantil))
			return false;
		if (masculino == null) {
			if (other.masculino != null)
				return false;
		} else if (!masculino.equals(other.masculino))
			return false;
		return true;
	}


}
