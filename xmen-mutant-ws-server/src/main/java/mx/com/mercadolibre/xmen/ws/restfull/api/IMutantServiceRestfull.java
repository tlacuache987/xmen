package mx.com.mercadolibre.xmen.ws.restfull.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mercadolibre.xmen.ws.rest.resource.restfull.Mutant;

@Path("/mutants")
public interface IMutantServiceRestfull {

	@POST
	@Path("")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postMutant(final Mutant mutant);
}
