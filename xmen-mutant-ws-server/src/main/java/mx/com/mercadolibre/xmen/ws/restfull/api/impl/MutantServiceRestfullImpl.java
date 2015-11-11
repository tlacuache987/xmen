package mx.com.mercadolibre.xmen.ws.restfull.api.impl;

import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.dna.DNA;
import mx.com.mercadolibre.xmen.service.api.IMutantFinderService;
import mx.com.mercadolibre.xmen.ws.rest.resource.restfull.Mutant;
import mx.com.mercadolibre.xmen.ws.restfull.api.IMutantServiceRestfull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("mutant-service-restfull")
public class MutantServiceRestfullImpl implements IMutantServiceRestfull {

	@Autowired
	private IMutantFinderService mutantFinderService;

	@Override
	public Response postMutant(Mutant mutant) {
		log.info("mutant: {}", mutant);

		final String[] dnaSequence = mutant.getDnaSequence().getSequences()
				.toArray(new String[0]);

		final DNA dna = new DNA(dnaSequence);

		boolean isMutant = mutantFinderService.isMutant(dna);

		mutant.setMutant(isMutant);

		return Response.ok(mutant).build();
	}
}
