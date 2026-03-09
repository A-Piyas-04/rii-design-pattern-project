package rii.factory;

/*
 * Factory Producer
 * Creates CarFactory objects (Abstract Factories).
 */
public class FactoryProducer {
    public static CarFactory getCarFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("COUPE")) {
            return new CoupeFactory();
        } else if (choice.equalsIgnoreCase("ROADSTER")) {
            return new RoadsterFactory();
        }
        return null;
    }
}
