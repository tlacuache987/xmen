package mx.com.mercadolibre.xmen.ws.restless.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mx.com.mercadolibre.xmen.ws.rest.resource.restless.DNASequenceRequest;

@Path("/dnaSequence")
public interface IDnaSequenceServiceRestless {

	@POST
	@Path("/analize")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response analize(final DNASequenceRequest dnaSequenceRequest);
}