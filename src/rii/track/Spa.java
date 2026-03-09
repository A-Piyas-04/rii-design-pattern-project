package rii.track;

/*
 * Simple Factory Pattern (Track)
 * Concrete track implementation.
 */
public class Spa extends Track {
    @Override
    public void trackInfo() {
        System.out.println("Track: Circuit de Spa-Francorchamps, Belgium");
    }
}
