package mx.com.mercadolibre.xmen.test.service.api.impl;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.dna.DNA;
import mx.com.mercadolibre.xmen.service.api.IMutantFinderService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@ContextConfiguration({ "classpath:/xmen-mutant-service-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class MutantFinderServiceImplTest {

	private static final String[] mutantDnaSequence = { "ATGCGA", "CAGTGC",
			"TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };

	private static final String[] noMutantDnaSequence = { "XYZ123", "IIIIII",
			"XYZ123", "123123", "ABCABC", "123123" };

	@Autowired
	private IMutantFinderService mutantFinderService;

	@Before
	public void setUp() {
		Assert.assertNotNull(mutantFinderService);
	}

	@Test
	public void mutantFinderServiceTest() {

		log.info("running mutantFinderServiceTest");
		log.info("-------------------------------------------------------");

		DNA dna = new DNA(mutantDnaSequence);

		boolean isMutant = mutantFinderService.isMutant(dna);

		Assert.assertTrue(isMutant);

		log.info("isMutant (true)?: {}", isMutant);

		log.info("running mutantFinderServiceTest");
		log.info("-------------------------------------------------------\n");
	}

	@Test
	public void noMutantFinderServiceTest() {

		log.info("running noMutantFinderServiceTest");
		log.info("-------------------------------------------------------");

		DNA dna = new DNA(noMutantDnaSequence);

		boolean isMutant = mutantFinderService.isMutant(dna);

		Assert.assertFalse(isMutant);

		log.info("isMutant (false)?: {}", isMutant);

		log.info("running noMutantFinderServiceTest");
		log.info("-------------------------------------------------------\n");
	}

}
