public class BrandBFactory implements SmartDeviceFactory {
    public Bulb createBulb() {
        BrandBBulb b = new BrandBBulb();
        b.setPowerUsage(DataReader.getPower("BrandB"));
        return b;
    }

    public Lock createLock() {
        BrandBLock l = new BrandBLock();
        l.setBatteryUsage(DataReader.getBattery("BrandB"));
        return l;
    }
}