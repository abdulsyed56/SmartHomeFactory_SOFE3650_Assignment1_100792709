// test driver to show the factories in action
public class Main {
    public static void main(String[] args) {
        // use Brand A factory
        SmartDeviceFactory factoryA = new BrandAFactory();
        Bulb bulbA = factoryA.createBulb();
        System.out.println("The power usage of the Brand A Bulb is: " + bulbA.getPowerUsage() + "W");

        // use Brand B factory
        SmartDeviceFactory factoryB = new BrandBFactory();
        Lock lockB = factoryB.createLock();
        System.out.println("The battery usage of the Brand B lock is: " + lockB.getBatteryUsage() + "%");
    }
}