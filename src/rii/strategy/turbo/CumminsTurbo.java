package rii.strategy.turbo;

/*
 * Strategy Pattern (Turbo)
 * Concrete implementation for Cummins Turbo.
 */
public class CumminsTurbo implements TurboStrategy {
    @Override
    public void showTurbo() {
        System.out.println("Turbocharger: Cummins");
    }
}
