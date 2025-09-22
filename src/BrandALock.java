public class BrandALock implements Lock {
    private int batteryUsage; // store battery usage

    public int getBatteryUsage() {
        return batteryUsage;
    }
    public void setBatteryUsage(int percent) {
        this.batteryUsage = percent;
    }
}