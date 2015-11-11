package mx.com.mercadolibre.xmen.core.dna;

import lombok.Getter;

public class DNA {
	private @Getter String[] dnaSequence;
	private @Getter char[][] dnaMatrix;

	public DNA(String[] dnaSequence) {
		this.dnaSequence = dnaSequence;
		this.generateDnaMatrix();
	}

	private void generateDnaMatrix() {
		dnaMatrix = new char[dnaSequence.length][dnaSequence[0].length()];

		for (int i = 0; i < dnaSequence.length; i++)
			dnaMatrix[i] = dnaSequence[i].toCharArray();

	}
}
