public class Main {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (distanceToPump / fuelLeft <= mpg) {
            return true;
        }
        return false;
    }
}
