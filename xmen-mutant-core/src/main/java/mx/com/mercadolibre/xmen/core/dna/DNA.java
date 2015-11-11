package mx.com.mercadolibre.xmen.core.dna;

import lombok.Data;

@Data
public class DNA {
	private String[] dnaSequence;

	public char[][] getDnaMatrix() {
		char[][] a = new char[dnaSequence.length][dnaSequence[0].length()];

		for (int i = 0; i < dnaSequence.length; i++) {

			char[] s = dnaSequence[i].toCharArray();

			for (int j = 0; j < s.length; j++) {
				System.out.print(s[j] + " ");

				a[i][j] = s[j];
			}
			System.out.println();
		}
		return a;
	}
}
