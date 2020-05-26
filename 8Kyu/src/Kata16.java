public class Kata16 {
    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + (salary * 10) : "£" + salary;
    }
}
