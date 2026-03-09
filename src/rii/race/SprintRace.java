package rii.race;

import rii.track.Track;

/*
 * Sprint Race Implementation
 * Specific behavior for Sprint Race.
 */
public class SprintRace extends Race {
    @Override
    protected void startLine(Track track) {
        System.out.println("Sprint Race Started");
        track.startLine();
    }
    
    @Override
    protected void finishLine(Track track) {
        System.out.println("End of Track Reached");
        track.finishLine();
    }
}
