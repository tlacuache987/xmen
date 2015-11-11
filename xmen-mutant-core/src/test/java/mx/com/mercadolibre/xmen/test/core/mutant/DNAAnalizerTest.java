package mx.com.mercadolibre.xmen.test.core.mutant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.dna.DNA;
import mx.com.mercadolibre.xmen.core.dna.DNAAnalizer;

@Slf4j
public class DNAAnalizerTest {

	private DNAAnalizer dnaAnalizer;

	private static final String[] mutantDnaSequence = { "ATGCGA", "CAGTGC",
			"TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };

	private static final String[] noMutantDnaSequence = { "XYZ123", "IIIIII",
			"XYZ123", "123123", "ABCABC", "123123" };

	@Before
	public void setUp() {
		Assert.assertNull(dnaAnalizer);
	}

	@Test
	public void isMutantTest() {

		log.info("running isMutantTest");
		log.info("-------------------------------------------------------");

		DNA dna = new DNA(mutantDnaSequence);

		this.dnaAnalizer = new DNAAnalizer(dna);

		boolean isMutant = this.dnaAnalizer.analize();

		Assert.assertTrue(isMutant);

		log.info("isMutant (true)?: {}", isMutant);

		log.info("running isMutantTest");
		log.info("-------------------------------------------------------\n");

	}

	@Test
	public void notMutantTest() {

		log.info("running notMutantTest");
		log.info("-------------------------------------------------------");

		DNA dna = new DNA(noMutantDnaSequence);

		this.dnaAnalizer = new DNAAnalizer(dna);

		boolean isMutant = this.dnaAnalizer.analize();

		Assert.assertFalse(isMutant);
		
		log.info("isMutant (false)?: {}", isMutant);

		log.info("running notMutantTest");
		log.info("-------------------------------------------------------\n");

	}
}
