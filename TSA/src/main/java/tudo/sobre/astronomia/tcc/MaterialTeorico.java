package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import TSA.entites.Identificavel;

@Entity
public class MaterialTeorico implements Identificavel {

	@Id
	@GeneratedValue(generator = "materialTeorico_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "materialTeorico_seq")
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

	public MaterialTeorico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaterialTeorico(Long id, String nomeMT) {
		super();
		this.id = id;
		this.nomeMT = nomeMT;
	}

	@Override
	public String toString() {
		return "MaterialTeorico [id=" + id + ", nomeMT=" + nomeMT + "]";
	}

}
