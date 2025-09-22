public class ExternalTestData {

    // return power usage value depending on which brand
    public static int getPower(String brand) {
        if (brand.equals("BrandA")) {
            return 10;
        } else if (brand.equals("BrandB")) {
            return 15;
        } else {
            return -1; // if brand is invalid
        }
    }

    // return battery usage  value depending on which brand
    public static int getBattery(String brand) {
        if (brand.equals("BrandA")) {
            return 20;
        } else if (brand.equals("BrandB")) {
            return 25;
        } else {
            return -1; // if brand is invalid
        }
    }
}