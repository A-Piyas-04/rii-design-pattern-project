package rii.factory;

import rii.car.Car;

/*
 * Abstract Factory Pattern (Cars)
 * Interface for creating cars.
 */
public interface CarFactory {
    Car createCar(String type);
}
