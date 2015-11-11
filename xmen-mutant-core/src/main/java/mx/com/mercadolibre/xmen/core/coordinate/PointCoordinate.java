package mx.com.mercadolibre.xmen.core.coordinate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PointCoordinate {
	private int x;
	private int y;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("(").append(this.x).append(",")
				.append(this.y).append(")");
		return sb.toString();
	}
}
