package rii.strategy.engine;

/*
 * Strategy Pattern (Engine)
 * Concrete implementation for V12 Engine.
 */
public class V12Engine implements EngineStrategy {
    @Override
    public void showEngine() {
        System.out.println("Engine Type: V12");
    }
}
