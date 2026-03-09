package rii.factory;

import rii.race.Race;
import rii.race.SprintRace;
import rii.race.CircuitRace;

/*
 * Race Factory
 * Creates Race objects.
 */
public class RaceFactory {
    public static Race createRace(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Sprint")) {
            return new SprintRace();
        } else if (type.equalsIgnoreCase("Circuit")) {
            return new CircuitRace();
        }
        return null;
    }
}
