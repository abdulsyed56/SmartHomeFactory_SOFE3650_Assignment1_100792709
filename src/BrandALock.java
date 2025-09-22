public class BrandALock implements Lock {
    private int batteryUsage;

    public void setBatteryUsage(int usage) {
        batteryUsage = usage;
    }

    public int getBatteryUsage() {
        return batteryUsage;
    }
}