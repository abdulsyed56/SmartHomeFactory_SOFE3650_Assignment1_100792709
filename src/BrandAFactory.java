public class BrandAFactory implements SmartDeviceFactory {
    public Bulb createBulb() {
        Bulb b = new BrandABulb(); // make a Brand A bulb
        b.setPowerUsage(ExternalTestData.getPower("BrandA")); // set value of power in watts after creation
        return b;
    }

    public Lock createLock() {
        Lock l = new BrandALock(); // make a Brand A lock
        l.setBatteryUsage(ExternalTestData.getBattery("BrandA")); // set value in percent after creation
        return l;
    }
}