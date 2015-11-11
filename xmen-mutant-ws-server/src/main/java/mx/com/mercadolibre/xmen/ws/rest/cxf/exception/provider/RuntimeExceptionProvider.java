package mx.com.mercadolibre.xmen.ws.rest.cxf.exception.provider;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Provider
@Component("runtimeExceptionProvider")
public class RuntimeExceptionProvider implements
		ExceptionMapper<RuntimeException> {

	private static Logger logger = LoggerFactory
			.getLogger(RuntimeExceptionProvider.class);

	public Response toResponse(RuntimeException e) {
		logger.error("An error ocurred !", e);

		return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
				.entity("<b>An error ocurred</b>:<br />" + e.getMessage())
				.build();
	}
}
