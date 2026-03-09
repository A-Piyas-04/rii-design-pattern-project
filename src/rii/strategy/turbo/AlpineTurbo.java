package rii.strategy.turbo;

/*
 * Strategy Pattern (Turbo)
 * Concrete implementation for Alpine Turbo.
 */
public class AlpineTurbo implements TurboStrategy {
    @Override
    public void showTurbo() {
        System.out.println("Turbocharger: Alpine");
    }
}
