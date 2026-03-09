package rii.factory;

import rii.strategy.engine.EngineStrategy;
import rii.strategy.engine.V6Engine;
import rii.strategy.engine.V8Engine;
import rii.strategy.engine.V12Engine;

/*
 * Engine Factory
 * Creates EngineStrategy objects.
 */
public class EngineFactory {
    public static EngineStrategy createEngine(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("V6")) {
            return new V6Engine();
        } else if (type.equalsIgnoreCase("V8")) {
            return new V8Engine();
        } else if (type.equalsIgnoreCase("V12")) {
            return new V12Engine();
        }
        return null;
    }
}
