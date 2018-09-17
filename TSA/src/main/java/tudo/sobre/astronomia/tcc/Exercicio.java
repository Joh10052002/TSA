package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import TSA.entites.Identificavel;

@Entity
public class Exercicio implements Identificavel{
	
	@Id
	@GeneratedValue(generator = "exercicio_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "exercicio_seq")
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

	public Exercicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exercicio(Long id, String nomeExer) {
		super();
		this.id = id;
		this.nomeExer = nomeExer;
	}

	@Override
	public String toString() {
		return "Exercicio [id=" + id + ", nomeExer=" + nomeExer + "]";
	}
	
}
