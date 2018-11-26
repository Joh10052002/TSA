package tudo.sobre.astronomia.tcc;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import TSA.entites.Identificavel;

@Entity
public class Usuario implements Identificavel {

	public Usuario() {
		super();
	}

	@Id
	@GeneratedValue(generator = "usuario_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "usuario_seq")
	private Long id;

	private String email;
	private String nome;
	private Date nascimento;

	private String username;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Usuario(Long id, String email, String nome, Date nascimento, String username, String password,
			String grupo) {
		super();
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.nascimento = nascimento;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", email=" + email + ", nome=" + nome + ", nascimento=" + nascimento
				+ ", username=" + username + ", password=" + password + " ]";
	}

}
