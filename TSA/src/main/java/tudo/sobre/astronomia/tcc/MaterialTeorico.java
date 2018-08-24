package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

import TSA.entites.Identificavel;

@Entity
public class MaterialTeorico implements Identificavel {
	
	@Id
	private Long id;
	private String nomeMT;
	
	public Long getId() {
		return id;
	}

	public void setId(Long idMT) {
		this.id = idMT;
	}

	public String getNomeMT() {
		return nomeMT;
	}

	public void setNomeMT(String nomeMT) {
		this.nomeMT = nomeMT;
	}
	
	
	

}
