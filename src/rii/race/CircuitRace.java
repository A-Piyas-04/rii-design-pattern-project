package rii.race;

import rii.track.Track;

/*
 * Circuit Race Implementation
 * Specific behavior for Circuit Race.
 */
public class CircuitRace extends Race {
    @Override
    protected void startLine(Track track) {
        System.out.println("Circuit Race Started");
        track.startLine();
    }
    
    @Override
    protected void finishLine(Track track) {
        System.out.println("Completed One Full Lap - Back at Start Line");
        track.finishLine();
    }
}
