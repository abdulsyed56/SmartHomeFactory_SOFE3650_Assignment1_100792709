public class BrandBLock implements Lock {
    private int batteryUsage;

    public void setBatteryUsage(int usage) {
        batteryUsage = usage;
    }

    public int getBatteryUsage() {
        return batteryUsage;
    }
}