public class Main {
    public static void main(String[] args) {
        Factory factory = new StandardFactory();
        Driver standardDriver = factory.createDriver("Daniele");
        Taxi taxi = factory.createTaxi(standardDriver, "XYZ12345");
        taxi.takePassenger("Passenger A");

        factory = new PremiumFactory();
        Driver premiumDriver = factory.createDriver("Daniele");
        taxi = factory.createTaxi(premiumDriver, "XYZ12345");
        taxi.takePassenger("Passenger B");
    }
}