package TSA.RS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;

import TSA.Services.UsuarioService;
import tudo.sobre.astronomia.tcc.Usuario;

@Path(" / usuario ")
public class UsuarioRS {

	@Inject
	private UsuarioService userService;

	@GET
	@Path("/nome/{id}")
	@Produces("text/html")
	public String getNome(@PathParam("id") Long id) {
		return "<h1>" + userService.getByID(id).getNome() + "<h1>";
	}

	@GET
	@Path("/list")
	@Produces("text/html")
	public String list() {
		String retorno = "<ul>";
		List<Usuario> users = userService.getAll();
		for (Usuario u : users) {
			retorno += "<li>" + u.getNome() + "</li>";

		}

		return retorno + "</ul>";
	}

	@GET
	@Path("/add/{user}")
	public String add(@PathParam("user") PathSegment atributos) throws ParseException {
		MultivaluedMap<String, String> matrixParameters = atributos.getMatrixParameters();
		String nome = matrixParameters.getFirst("nome");
		String email = matrixParameters.getFirst("email");
		String nascimento = matrixParameters.getFirst("nascimento");
		String id = matrixParameters.getFirst("id");
		String password = matrixParameters.getFirst("password");
		String username = matrixParameters.getFirst("username");
		Usuario u = new Usuario();
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		u.setEmail(email);
		u.setId(Long.parseLong(id));
		try {
			u.setNascimento(format.parse(nascimento));
		} catch (ParseException e) {
			throw new ParseException("Errou", 1);
		}
		u.setNome(nome);
		u.setPassword(password);
		u.setUsername(username);
		return "Salvo comsucesso";
	}

}
