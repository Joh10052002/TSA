package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exercicio {
	
	@Id
	private String idExer;
	private String nomeExer;
	
	public Exercicio(String idExer, String nomeExer) {
		super();
		this.idExer = idExer;
		this.nomeExer = nomeExer;
	}

	public String getIdExer() {
		return idExer;
	}

	public void setIdExer(String idExer) {
		this.idExer = idExer;
	}

	public String getNomeExer() {
		return nomeExer;
	}

	public void setNomeExer(String nomeExer) {
		this.nomeExer = nomeExer;
	}
	
	
	

}
