package mx.com.mercadolibre.xmen.test.core.mutant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.dna.DNA;

@Slf4j
public class DNATest {

	private DNA dna;

	@Before
	public void setUp() {
		Assert.assertNull(dna);
	}

	@Test
	public void getDnaMatrixTest() {

		log.info("running getDnaMatrixTest");
		log.info("-------------------------------------------------------");

		String[] dnaSequence = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG",
				"CCCCTA", "TCACTG" };

		this.dna = new DNA(dnaSequence);

		char[][] dnaMatrix = this.dna.getDnaMatrix();

		int i = 0;
		for (char[] currSequence : dnaMatrix) {
			String currSequenceString = String.valueOf(currSequence);

			if (!currSequenceString.equals(dnaSequence[i++])) {
				Assert.fail("The sequence String not match.");
			}
		}

		log.info("finalize getDnaMatrixTest");
		log.info("-------------------------------------------------------\n");

	}
}
