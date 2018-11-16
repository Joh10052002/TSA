package tudo.sobre.astronomia.tcc.beans;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import TSA.Services.UsuarioService;
import tudo.sobre.astronomia.tcc.Usuario;

@ViewScoped
@Named
public class UsuarioBean {

	@Inject

	private UsuarioService service;

	protected Usuario usuario;

	protected Collection<Usuario> usuarios;

	public UsuarioBean() {
	}

	@PostConstruct
	public void init() {
		usuario = newUsuario();
		usuarios = getService().getAll();

	}

	public void remove(Usuario usuarios) {
		getService().remove(usuario);
		limpar();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Collection<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Collection<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void save() {
		getService().save(usuario);
		limpar();
	}

	public void editar(Long id) {
		this.getUsuario().setId(id);
		save();
	}

	public void limpar() {
		usuarios = getService().getAll();
		usuario = newUsuario();
	}

	protected Usuario newUsuario() {
		return new Usuario();
	}

	public UsuarioService getService() {
		return service;
	}

}
