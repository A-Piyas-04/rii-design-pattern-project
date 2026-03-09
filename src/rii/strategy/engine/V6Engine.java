package rii.strategy.engine;

/*
 * Strategy Pattern (Engine)
 * Concrete implementation for V6 Engine.
 */
public class V6Engine implements EngineStrategy {
    @Override
    public void showEngine() {
        System.out.println("Engine Type: V6");
    }
}
