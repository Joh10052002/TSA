
package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

import TSA.entites.Identificavel;

@Entity
public class Video implements Identificavel {
	
	@Id
	private Long id;
	private String nomeVid;
	

	public Long getId() {
		return id;
	}

	public void setId(Long idVid) {
		this.id = idVid;
	}

	public String getNomeVid() {
		return nomeVid;
	}

	public void setNomeVid(String nomeVid) {
		this.nomeVid = nomeVid;
	}
	
	
	
	

}
