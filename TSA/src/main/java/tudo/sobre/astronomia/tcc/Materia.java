package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class Materia {

	@Id
	@GeneratedValue(generator = "materia_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "materia_seq")
	private Long id;
	
	private String nomeMateria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materia(Long idMateria, String nomeMateria) {
		super();
		this.id = idMateria;
		this.nomeMateria = nomeMateria;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nomeMateria=" + nomeMateria + "]";
	}
	
}
