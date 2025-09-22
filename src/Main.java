public class Main {
    public static void main(String[] args) {
        SmartDeviceFactory fA = new BrandAFactory();
        Bulb bulbA = fA.createBulb();
        System.out.println("Brand A Bulb Power Usage: " + bulbA.getPowerUsage() + "W");

        SmartDeviceFactory fB = new BrandBFactory();
        Lock lockB = fB.createLock();
        System.out.println("Brand B Lock Battery Usage: " + lockB.getBatteryUsage() + "%");
    }
}