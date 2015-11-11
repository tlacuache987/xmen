package mx.com.mercadolibre.xmen.core.coordinate;

import mx.com.mercadolibre.xmen.core.coordinate.enums.Direction;
import static mx.com.mercadolibre.xmen.core.coordinate.enums.Direction.*;

public abstract class Coordinates {
	public static final Direction[] directions = { UP, DOWN, LEFT, RIGHT,
			UP_LEFT, UP_RIGHT, DOWN_LEFT, DOWN_RIGHT };
}
