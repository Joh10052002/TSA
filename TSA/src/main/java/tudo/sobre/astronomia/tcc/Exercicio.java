package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

import TSA.entites.Identificavel;

@Entity
public class Exercicio implements Identificavel{
	
	@Id
	private Long id;
	private String nomeExer;
	
	public Long getId() {
		return id;
	}

	public void setId(Long idExer) {
		this.id = idExer;
	}

	public String getNomeExer() {
		return nomeExer;
	}

	public void setNomeExer(String nomeExer) {
		this.nomeExer = nomeExer;
	}
	

}
