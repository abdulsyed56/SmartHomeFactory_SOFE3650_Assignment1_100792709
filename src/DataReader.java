import java.util.HashMap;
import java.util.Map;

public class DataReader {
    private static final Map<String, Integer> power = new HashMap<String, Integer>();
    private static final Map<String, Integer> battery = new HashMap<String, Integer>();

    static {
        power.put("BrandA", 10);
        power.put("BrandB", 15);
        battery.put("BrandA", 20);
        battery.put("BrandB", 25);
    }

    public static int getPower(String brand) {
        Integer v = power.get(brand);
        return v == null ? 0 : v.intValue();
    }

    public static int getBattery(String brand) {
        Integer v = battery.get(brand);
        return v == null ? 0 : v.intValue();
    }
}