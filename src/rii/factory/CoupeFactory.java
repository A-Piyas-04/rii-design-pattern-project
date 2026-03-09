package rii.factory;

import rii.car.Car;
import rii.car.ToyotaGR86;
import rii.car.SubaruBRZ;

/*
 * Abstract Factory Pattern (Cars)
 * Concrete factory for Coupe cars.
 */
public class CoupeFactory implements CarFactory {
    @Override
    public Car createCar(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("ToyotaGR86")) {
            return new ToyotaGR86();
        } else if (type.equalsIgnoreCase("SubaruBRZ")) {
            return new SubaruBRZ();
        }
        return null;
    }
}
