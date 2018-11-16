package TSA.Services;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import TSA.dao.UsuarioDAO;
import tudo.sobre.astronomia.tcc.Usuario;
import tudo.sobre.astronomia.tcc.util.TransacionalCdi;

public class UsuarioService implements Serializable, Service<Usuario> {

	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private UsuarioDAO usuarioDAO;

	@Override
	@TransacionalCdi
	public void save(Usuario usuario) {
		usuarioDAO.save(usuario);
	}

	@Override
	@TransacionalCdi
	public void update(Usuario usuario) {
		usuarioDAO.update(usuario);
	}

	@Override
	@TransacionalCdi
	public void remove(Usuario usuario) {
		usuarioDAO.remove(usuario);
	}

	@Override
	public Usuario getByID(long usuarioId) {
		return usuarioDAO.getByID(usuarioId);
	}

	@Override
	public List<Usuario> getAll() {
		return usuarioDAO.getAll();
	}

}
