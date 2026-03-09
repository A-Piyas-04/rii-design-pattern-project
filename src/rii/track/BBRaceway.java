package rii.track;

/*
 * Simple Factory Pattern (Track)
 * Concrete track implementation.
 */
public class BBRaceway extends Track {
    @Override
    public void trackInfo() {
        System.out.println("Track: BB Raceway, Japan");
    }
}
