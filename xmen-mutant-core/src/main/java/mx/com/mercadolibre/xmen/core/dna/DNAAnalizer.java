package mx.com.mercadolibre.xmen.core.dna;

import lombok.Data;

@Data
public class DNAAnalizer {
	private DNA dna;
	private char[][] matrix;

	public boolean analize() {
		return this.isMutant(dna.getDnaSequence());
	}

	private boolean isMutant(String[] dna) {
		return false;
	}

}
