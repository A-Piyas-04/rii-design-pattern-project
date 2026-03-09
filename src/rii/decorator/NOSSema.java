package rii.decorator;

import rii.car.Car;

/*
 * Decorator Pattern (NOS)
 * Concrete decorator adding Sema NOS.
 */
public class NOSSema extends CarDecorator {

    public NOSSema(Car decoratedCar) {
        super(decoratedCar);
    }

    public void applyNOS() {
        System.out.println("Sema NOS applied");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        applyNOS();
    }
}
