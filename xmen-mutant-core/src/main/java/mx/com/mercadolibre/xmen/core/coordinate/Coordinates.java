package mx.com.mercadolibre.xmen.core.coordinate;

import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.DOWN;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.DOWN_LEFT;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.DOWN_RIGHT;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.LEFT;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.RIGHT;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.UP;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.UP_LEFT;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.UP_RIGHT;
import mx.com.mercadolibre.xmen.core.coordinate.enums.Direction;

public final class Coordinates {

	public static final Direction[] directions = { UP, DOWN, LEFT, RIGHT,
			UP_LEFT, UP_RIGHT, DOWN_LEFT, DOWN_RIGHT };

	private Coordinates() {
	}
}
