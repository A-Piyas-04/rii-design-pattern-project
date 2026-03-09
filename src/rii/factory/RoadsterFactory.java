package rii.factory;

import rii.car.Car;
import rii.car.PorscheBoxster;
import rii.car.Ferrari812;

/*
 * Abstract Factory Pattern (Cars)
 * Concrete factory for Roadster cars.
 */
public class RoadsterFactory implements CarFactory {
    @Override
    public Car createCar(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("PorscheBoxster")) {
            return new PorscheBoxster();
        } else if (type.equalsIgnoreCase("Ferrari812")) {
            return new Ferrari812();
        }
        return null;
    }
}
