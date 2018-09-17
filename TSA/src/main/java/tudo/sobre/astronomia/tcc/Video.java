
package tudo.sobre.astronomia.tcc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import TSA.entites.Identificavel;

@Entity
public class Video implements Identificavel {

	@Id
	@GeneratedValue(generator = "video_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "video_seq")
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

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(Long id, String nomeVid) {
		super();
		this.id = id;
		this.nomeVid = nomeVid;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", nomeVid=" + nomeVid + "]";
	}
	
}
