public class BrandAFactory implements SmartDeviceFactory {
    public Bulb createBulb() {
        BrandABulb b = new BrandABulb();
        b.setPowerUsage(DataReader.getPower("BrandA"));   // set after creation
        return b;
    }
    public Lock createLock() {
        BrandALock l = new BrandALock();
        l.setBatteryUsage(DataReader.getBattery("BrandA")); // set after creation
        return l;
    }
}