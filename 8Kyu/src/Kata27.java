public class Kata27 {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double saveOnBottle = (double)normPrice * (double) discount / 100;
        double solution = Math.floor(hol / saveOnBottle);
        return (int) solution;
    }
}
