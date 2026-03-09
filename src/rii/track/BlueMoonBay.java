package rii.track;

/*
 * Simple Factory Pattern (Track)
 * Concrete track implementation.
 */
public class BlueMoonBay extends Track {
    @Override
    public void trackInfo() {
        System.out.println("Track: Blue Moon Bay, USA");
    }
}
