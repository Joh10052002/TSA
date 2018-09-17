package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Modulo {

	@Id
	@GeneratedValue(generator = "modulo_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name= "modelo_seq")
	private Long id;
	
	private String nomeModulo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeModulo() {
		return nomeModulo;
	}

	public void setNomeModulo(String nomeModulo) {
		this.nomeModulo = nomeModulo;
	}

	public Modulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modulo(Long id, String nomeModulo) {
		super();
		this.id = id;
		this.nomeModulo = nomeModulo;
	}

	@Override
	public String toString() {
		return "Modulo [id=" + id + ", nomeModulo=" + nomeModulo + "]";
	}
	
}
