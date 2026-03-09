package rii.factory;

import rii.strategy.turbo.TurboStrategy;
import rii.strategy.turbo.AlpineTurbo;
import rii.strategy.turbo.CumminsTurbo;
import rii.strategy.turbo.HoneywellTurbo;

/*
 * Turbo Factory
 * Creates TurboStrategy objects.
 */
public class TurboFactory {
    public static TurboStrategy createTurbo(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Alpine")) {
            return new AlpineTurbo();
        } else if (type.equalsIgnoreCase("Cummins")) {
            return new CumminsTurbo();
        } else if (type.equalsIgnoreCase("Honeywell")) {
            return new HoneywellTurbo();
        }
        return null;
    }
}
