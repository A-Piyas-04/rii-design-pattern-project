package rii.decorator;

import rii.car.Car;

/*
 * Decorator Pattern (NOS)
 * Concrete decorator adding Resonac NOS.
 */
public class NOSResonac extends CarDecorator {

    public NOSResonac(Car decoratedCar) {
        super(decoratedCar);
    }

    public void applyNOS() {
        System.out.println("Resonac NOS applied");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        applyNOS();
    }
}
