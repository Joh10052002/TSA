package TSA.Services;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import tudo.sobre.astronomia.tcc.MaterialTeorico;
import tudo.sobre.astronomia.tcc.util.TransacionalCdi;

@ApplicationScoped
public class MTService implements Serializable, Service <MaterialTeorico> {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7803325791425670859L;
		
		@Inject
		private MaterialTeoricoDAO mtDAO;
		
		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void save(MaterialTeorico mt) {
			mtDAO.save(mt);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
		 */
		@Override
		@TransacionalCdi
		public void update(MaterialTeorico mt)  {
				mtDAO.update(mt);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
		 */
		@Override
		@TransacionalCdi
		public void remove(MaterialTeorico mt) {
			mtDAO.remove(mt);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
		 */
		@Override
		public MaterialTeorico getByID(long mtId)  {
				return mtDAO.getByID(mtId);
		}

		/* (non-Javadoc)
		 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
		 */
		@Override
		public List<MaterialTeorico> getAll() {
				return mtDAO.getAll();
		}
			
	}