package rii.decorator;

import rii.car.Car;

/*
 * Decorator Pattern (NOS)
 * Abstract decorator for adding NOS to cars.
 */
public abstract class CarDecorator extends Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public void start() {
        decoratedCar.start();
    }

    @Override
    public void accelerate() {
        decoratedCar.accelerate();
    }

    @Override
    public void stop() {
        decoratedCar.stop();
    }

    @Override
    public void carInfo() {
        decoratedCar.carInfo();
    }
}
