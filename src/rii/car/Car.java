package rii.car;

import rii.strategy.engine.EngineStrategy;
import rii.strategy.turbo.TurboStrategy;

/*
 * Car Hierarchy
 * Abstract base class using Strategy Pattern.
 */
public abstract class Car {
    protected EngineStrategy engineStrategy;
    protected TurboStrategy turboStrategy;
    
    public void setEngineStrategy(EngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }
    
    public void setTurboStrategy(TurboStrategy turboStrategy) {
        this.turboStrategy = turboStrategy;
    }
    
    public void showSpecifications() {
        if (engineStrategy != null) {
            engineStrategy.showEngine();
        }
        if (turboStrategy != null) {
            turboStrategy.showTurbo();
        }
    }
    
    public void start() {
        System.out.println("Car started.");
    }
    
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
    
    public void stop() {
        System.out.println("Car stopped.");
    }
    
    public abstract void carInfo();
}
