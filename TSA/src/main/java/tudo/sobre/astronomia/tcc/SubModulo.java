package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubModulo {
	
	@Id
	private String idSM;
	private String nomeSM;
	
	public SubModulo(String idSM, String nomeSM) {
		super();
		this.idSM = idSM;
		this.nomeSM = nomeSM;
	}

	public String getIdSM() {
		return idSM;
	}

	public void setIdSM(String idSM) {
		this.idSM = idSM;
	}

	public String getNomeSM() {
		return nomeSM;
	}

	public void setNomeSM(String nomeSM) {
		this.nomeSM = nomeSM;
	}
	
	
	

}
