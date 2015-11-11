package mx.com.mercadolibre.xmen.ws.restless.api.impl;

import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.dna.DNA;
import mx.com.mercadolibre.xmen.service.api.IMutantFinderService;
import mx.com.mercadolibre.xmen.ws.rest.resource.restless.DNASequenceRequest;
import mx.com.mercadolibre.xmen.ws.rest.resource.restless.DNASequenceResponse;
import mx.com.mercadolibre.xmen.ws.restless.api.IDnaSequenceServiceRestless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service("dnaSequence-service-restless")
public class DnaSequenceServiceRestlessImpl implements
		IDnaSequenceServiceRestless {

	@Autowired
	private IMutantFinderService mutantFinderService;

	@Override
	public Response analize(DNASequenceRequest dnaSequenceRequest) {

		log.info("dnaSequenceRequest: {}", dnaSequenceRequest);

		final String[] dnaSequence = dnaSequenceRequest.getDnaSequence()
				.getSequences().toArray(new String[0]);

		final DNA dna = new DNA(dnaSequence);

		boolean isMutant = mutantFinderService.isMutant(dna);

		final DNASequenceResponse response = new DNASequenceResponse();
		response.setMutant(isMutant);

		return Response.ok(response).build();
	}
}
