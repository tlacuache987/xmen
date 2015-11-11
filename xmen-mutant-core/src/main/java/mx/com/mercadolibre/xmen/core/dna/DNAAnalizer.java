package mx.com.mercadolibre.xmen.core.dna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

import lombok.extern.slf4j.Slf4j;
import mx.com.mercadolibre.xmen.core.coordinate.Coordinates;
import mx.com.mercadolibre.xmen.core.coordinate.PointCoordinate;
import mx.com.mercadolibre.xmen.core.coordinate.enums.Direction;

@Slf4j
public class DNAAnalizer {
	private DNA dna;
	private Set<String> possibleMutantSequences;

	public DNAAnalizer(DNA dna) {
		this.dna = dna;
	}

	public boolean analize() {
		this.calculatePossibleMutantSequences();

		printDnaMatrix();

		return this.isMutant(dna.getDnaSequence());
	}

	private boolean isMutant(String[] dna) {

		List<PointCoordinate> list;

		Iterator<String> it = this.possibleMutantSequences.iterator();

		int mutantSequencesSearched = 0;

		while (it.hasNext()) {

			int timesCurrentSequenceSearched = 0;

			String posibleMutantSequence = it.next();

			log.debug("searching posible mutant sequence: {}",
					posibleMutantSequence);

			for (int i = 0; i < this.dna.getDnaMatrix()[0].length; i++) {
				for (int j = 0; j < this.dna.getDnaMatrix().length; j++) {

					for (Direction direction : Coordinates.directions) {

						list = searchMutantSequence(i, j, direction,
								posibleMutantSequence);

						if (list != null) {
							timesCurrentSequenceSearched++;
							log.debug("{}", list);
						}
					}

				}
			}

			if (timesCurrentSequenceSearched == 2)
				mutantSequencesSearched++;
		}

		return mutantSequencesSearched >= 2 ? true : false;
	}

	private void calculatePossibleMutantSequences() {
		String dnaSequence = String.join("",
				Arrays.asList(this.dna.getDnaSequence()));

		Set<String> nitrogenBase = new HashSet<String>();
		for (char c : dnaSequence.toCharArray())
			nitrogenBase.add(String.valueOf(c));

		List<String> list = new ArrayList<String>(nitrogenBase);

		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String s) {
				StringBuilder sb = new StringBuilder(s);
				for (int i = 0; i < 3; i++)
					sb.append(s);
				return sb.toString();
			}
		});

		this.possibleMutantSequences = new HashSet<String>(list);
	}

	private ArrayList<PointCoordinate> searchMutantSequence(int x, int y,
			Direction direction, String mutantSequence) {

		ArrayList<PointCoordinate> list = new ArrayList<PointCoordinate>();
		int mutantSequenceIndex = 0;

		char[] mutantSequenceCharArray = mutantSequence.toCharArray();

		boolean searched = false;

		while (true) {
			if (x >= this.dna.getDnaMatrix()[0].length
					|| x < 0
					|| y >= this.dna.getDnaMatrix().length
					|| y < 0
					|| mutantSequenceIndex >= mutantSequenceCharArray.length
					|| this.dna.getDnaMatrix()[y][x] != mutantSequenceCharArray[mutantSequenceIndex]) {
				searched = false;
				break;
			}

			list.add(new PointCoordinate(y, x));

			if (mutantSequenceIndex == mutantSequenceCharArray.length - 1) {
				searched = true;
				break;
			}

			x += direction.getX();
			y += direction.getY();
			mutantSequenceIndex++;
		}

		if (!searched)
			return null;

		return list;
	}

	private void printDnaMatrix() {
		StringBuilder sb = new StringBuilder("\n");

		for (char[] arr : this.dna.getDnaMatrix()) {
			for (char c : arr) {
				sb.append(c).append(" ");
			}
			sb.append("\n");
		}

		log.debug("{}", sb);
	}
}
