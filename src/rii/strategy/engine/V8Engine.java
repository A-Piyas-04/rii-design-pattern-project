package rii.strategy.engine;

/*
 * Strategy Pattern (Engine)
 * Concrete implementation for V8 Engine.
 */
public class V8Engine implements EngineStrategy {
    @Override
    public void showEngine() {
        System.out.println("Engine Type: V8");
    }
}
