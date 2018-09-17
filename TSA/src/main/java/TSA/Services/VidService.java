package TSA.Services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import TSA.dao.ExercicioDAO;
import TSA.dao.VideoDAO;
import tudo.sobre.astronomia.tcc.Exercicio;
import tudo.sobre.astronomia.tcc.Video;
import tudo.sobre.astronomia.tcc.util.TransacionalCdi;

@ApplicationScoped
public class VidService implements Serializable, Service<Video> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;

	@Inject
	private VideoDAO vidDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.
	 * ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Video vid) {
		vidDAO.save(vid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Video vid) {
		vidDAO.update(vid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2
	 * .ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Video vid) {
		vidDAO.remove(vid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Video getByID(long vidId) {
		return vidDAO.getByID(vidId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Video> getAll() {
		return vidDAO.getAll();
	}

}
