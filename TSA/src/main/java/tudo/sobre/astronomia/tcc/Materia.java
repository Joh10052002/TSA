package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Materia {
	
	@Id
	private String idMateria;
	private String nomeMateria;
	
	public Materia(String idMateria, String nomeMateria) {
		super();
		this.idMateria = idMateria;
		this.nomeMateria = nomeMateria;
	}

	public String getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	
	

}
