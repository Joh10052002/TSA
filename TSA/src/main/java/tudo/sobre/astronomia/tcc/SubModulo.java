package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SubModulo {

	@Id
	@GeneratedValue(generator = "subModelo_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "subModelo_seq")
	private Long id;

	private String nomeSM;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeSM() {
		return nomeSM;
	}

	public void setNomeSM(String nomeSM) {
		this.nomeSM = nomeSM;
	}

	public SubModulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubModulo(Long id, String nomeSM) {
		super();
		this.id = id;
		this.nomeSM = nomeSM;
	}

	@Override
	public String toString() {
		return "SubModulo [id=" + id + ", nomeSM=" + nomeSM + "]";
	}

}
