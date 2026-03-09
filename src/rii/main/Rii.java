package rii.main;

import java.util.Scanner;
import rii.player.Player;
import rii.factory.CarFactory;
import rii.factory.FactoryProducer;
import rii.factory.EngineFactory;
import rii.factory.TurboFactory;
import rii.factory.RaceFactory;
import rii.factory.InputFactory;
import rii.car.Car;
import rii.strategy.engine.EngineStrategy;
import rii.strategy.turbo.TurboStrategy;
import rii.factory.TrackFactory;
import rii.track.Track;
import rii.race.Race;

/*
 * Main Class (Racing In IUT)
 * Entry point for the application.
 */
public class Rii {
    public static void main(String[] args) {
        Scanner scanner = InputFactory.getScanner();
        
        // 1. Get Player instance (Singleton)
        Player player = Player.getInstance();
        
        // 2. Ask for Car Category
        System.out.println("Select Car Category (COUPE/ROADSTER): ");
        String categoryInput = scanner.nextLine();
        
        CarFactory carFactory = FactoryProducer.getCarFactory(categoryInput);
        
        if (carFactory == null) {
            System.out.println("Invalid category.");
            return;
        }
        
        // 3. Ask for Car Model
        System.out.println("Enter Car Model (e.g. ToyotaGR86, SubaruBRZ, PorscheBoxster, Ferrari812): ");
        String modelInput = scanner.nextLine();
        Car car = carFactory.createCar(modelInput);
        
        if (car == null) {
            System.out.println("Invalid car model.");
            return;
        }
        
        // 4. Set Engine Strategy
        System.out.println("Select Engine Type (V6/V8/V12): ");
        String engineInput = scanner.nextLine();
        EngineStrategy engine = EngineFactory.createEngine(engineInput);
        
        if (engine == null) {
            System.out.println("Invalid engine type.");
            return;
        }
        car.setEngineStrategy(engine);
        
        // 5. Set Turbo Strategy
        System.out.println("Select Turbo Type (Alpine/Cummins/Honeywell): ");
        String turboInput = scanner.nextLine();
        TurboStrategy turbo = TurboFactory.createTurbo(turboInput);
        
        if (turbo == null) {
            System.out.println("Invalid turbo type.");
            return;
        }
        car.setTurboStrategy(turbo);
        
        // 6. Create Track using TrackFactory
        System.out.println("Select Track (Blue Moon Bay/BB Raceway/Spa): ");
        String trackInput = scanner.nextLine();
        Track track = TrackFactory.createTrack(trackInput);
        
        if (track == null) {
            System.out.println("Invalid track.");
            return;
        }
        
        // 7. Create Race Type
        System.out.println("Select Race Type (Sprint/Circuit): ");
        String raceTypeInput = scanner.nextLine();
        Race race = RaceFactory.createRace(raceTypeInput);
        
        if (race == null) {
            System.out.println("Invalid race type.");
            return;
        }
        
        // 8. Call race.race(car, track)
        race.race(car, track);
        
        scanner.close();
    }
}
