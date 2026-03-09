package rii.strategy.turbo;

/*
 * Strategy Pattern (Turbo)
 * Concrete implementation for Honeywell Turbo.
 */
public class HoneywellTurbo implements TurboStrategy {
    @Override
    public void showTurbo() {
        System.out.println("Turbocharger: Honeywell");
    }
}
