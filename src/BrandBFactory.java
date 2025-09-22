public class BrandBFactory implements SmartDeviceFactory {
    public Bulb createBulb() {
        Bulb b = new BrandBBulb(); // make a Brand B bulb
        b.setPowerUsage(ExternalTestData.getPower("BrandB")); // set value after creation
        return b;
    }

    public Lock createLock() {
        Lock l = new BrandBLock(); // make a Brand B lock
        l.setBatteryUsage(ExternalTestData.getBattery("BrandB")); // set value after creation
        return l;
    }
}