package rii.factory;

import rii.track.Track;
import rii.track.BlueMoonBay;
import rii.track.BBRaceway;
import rii.track.Spa;

/*
 * Simple Factory Pattern (Track)
 * Factory class to create tracks.
 */
public class TrackFactory {
    public static Track createTrack(String name) {
        if (name == null) {
            return null;
        }
        if (name.equalsIgnoreCase("Blue Moon Bay")) {
            return new BlueMoonBay();
        } else if (name.equalsIgnoreCase("BB Raceway")) {
            return new BBRaceway();
        } else if (name.equalsIgnoreCase("Spa")) {
            return new Spa();
        }
        return null;
    }
}
