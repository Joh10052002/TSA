package TSA.RS;

import java.text.ParseException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;

import TSA.Services.ExerService;
import tudo.sobre.astronomia.tcc.Exercicio;

@Path(" / exercicio")
public class ExercicioRS {

	@Inject
	private ExerService exerService;

	@GET
	@Path("/nome/{id}")
	@Produces("text/html")
	public String getNome(@PathParam("id") Long id) {
		return "<h1>" + exerService.getByID(id).getNomeExer() + "<h1>";
	}

	@GET
	@Path("/list")
	@Produces("text/html")
	public String list() {
		String retorno = "<ul>";
		List<Exercicio> exers = exerService.getAll();
		for (Exercicio e : exers) {
			retorno += "<li>" + e.getNomeExer() + "</li>";

		}

		return retorno + "</ul>";
	}

	@GET
	@Path("/add/{exer}")
	public String add(@PathParam("exer") PathSegment atributos) throws ParseException {
		MultivaluedMap<String, String> matrixParameters = atributos.getMatrixParameters();
		String nome = matrixParameters.getFirst("nome");
		String id = matrixParameters.getFirst("id");
		Exercicio e = new Exercicio();
		e.setId(Long.parseLong(id));
		e.setNomeExer(nome);
		return "Salvo comsucesso";

	}

}
