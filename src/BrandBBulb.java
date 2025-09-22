public class BrandBBulb implements Bulb {
    private int powerUsage; // store power usage

    public int getPowerUsage() {
        return powerUsage;
    }
    public void setPowerUsage(int watts) {
        this.powerUsage = watts;
    }
}