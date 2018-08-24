package TSA.Services;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import TSA.dao.ExercicioDAO;
import tudo.sobre.astronomia.tcc.Exercicio;
import tudo.sobre.astronomia.tcc.util.TransacionalCdi;

@ApplicationScoped
public class ExerService implements Serializable, Service <Exercicio> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private ExercicioDAO exerDAO;
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void save(Exercicio exer) {
			exerDAO.save(exer);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
		 */
		@Override
		@TransacionalCdi
		public void update(Exercicio exer)  {
				exerDAO.update(exer);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void remove(Exercicio exer) {
			exerDAO.remove(exer);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public Exercicio getByID(long exerId)  {
				return exerDAO.getByID(exerId);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		@Override
		public List<Exercicio> getAll() {
				return exerDAO.getAll();
		}
			
	}

