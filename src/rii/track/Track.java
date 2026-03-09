package rii.track;

/*
 * Simple Factory Pattern (Track)
 * Abstract base class for tracks.
 */
public abstract class Track {
    public abstract void trackInfo();
    
    public void startLine() {
        System.out.println("At the Start Line.");
    }
    
    public void finishLine() {
        System.out.println("Crossed the Finish Line.");
    }
}
