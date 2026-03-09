package rii.race;

import rii.car.Car;
import rii.track.Track;
import rii.decorator.NOSResonac;
import rii.decorator.NOSSema;
import java.util.Scanner;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/*
 * Template Method Pattern (Race)
 * Defines the skeleton of the race algorithm.
 */
public abstract class Race {
    
    // Scanner is static to prevent multiple wrappers on System.in
    protected static Scanner scanner = new Scanner(System.in);

    public final void race(Car car, Track track) {
        if (car == null || track == null) return;

        // a) Car.carInfo();
        car.carInfo();
        
        // b) Track.trackInfo();
        track.trackInfo();
        
        // Optional: show specs
        car.showSpecifications();
        
        // c) startCar(Car);
        car.start();
        
        // d) startLine(Track);
        startLine(track);
        
        // e) accelerateCar(Car);
        car.accelerate();
        
        // f) NOS = pitStop(Car);
        car = pitStop(car);
        
        // g) applyNos(NOS);
        if (car instanceof rii.decorator.CarDecorator) {
             // Demonstrates applying NOS behavior
             ((rii.decorator.CarDecorator) car).accelerate();
        }
        
        // h) finishLine(Track);
        finishLine(track);
        
        // i) stopCar(NOS);
        car.stop();
        
        // j) lapTime();
        lapTime();
    }
    
    // Abstract hooks for subclasses to implement specific race behavior
    protected abstract void startLine(Track track);
    protected abstract void finishLine(Track track);

    protected Car pitStop(Car car) {
        System.out.println("Do you want to apply NOS? (yes/no): ");
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Select NOS type (Resonac/Sema): ");
            String type = scanner.nextLine();
            
            if (type.equalsIgnoreCase("Resonac")) {
                return new NOSResonac(car);
            } else if (type.equalsIgnoreCase("Sema")) {
                return new NOSSema(car);
            }
        }
        return car;
    }
    
    protected void lapTime() {
        Random rand = new Random();
        // Generate random time in milliseconds (e.g., 60 to 180 seconds)
        long millis = (rand.nextInt(120) + 60) * 1000L;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT")); // Ensure 0-based time
        System.out.println("Lap Time: " + sdf.format(new Date(millis)));
    }
}
