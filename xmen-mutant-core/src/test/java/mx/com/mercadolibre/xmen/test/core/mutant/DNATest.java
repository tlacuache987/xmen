package mx.com.mercadolibre.xmen.test.core.mutant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mx.com.mercadolibre.xmen.core.dna.DNA;

public class DNATest {

	private DNA dna = new DNA();

	@Before
	public void setUp() {
		Assert.assertNotNull(dna);
	}

	@Test
	public void getDnaMatrixTest() {

		String[] dnaSequence = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG",
				"CCCCTA", "TCACTG" };

		dna.setDnaSequence(dnaSequence);

		char[][] dnaMatrix = dna.getDnaMatrix();

		int i = 0;
		for (char[] currSequence : dnaMatrix) {
			String currSequenceString = String.valueOf(currSequence);

			if (!currSequenceString.equals(dnaSequence[i++])) {
				Assert.fail("The sequence String not match.");
			}
		}

	}
}
