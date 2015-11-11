package mx.com.mercadolibre.xmen.service.api.impl;

import mx.com.mercadolibre.xmen.core.dna.DNA;
import mx.com.mercadolibre.xmen.core.dna.DNAAnalizer;
import mx.com.mercadolibre.xmen.service.api.IMutantFinderService;

import org.springframework.stereotype.Service;

@Service
public class MutantFinderServiceImpl implements IMutantFinderService {

	@Override
	public boolean isMutant(DNA dna) {

		DNAAnalizer dnaAnalizer = new DNAAnalizer(dna);

		return dnaAnalizer.analize();
	}

}
