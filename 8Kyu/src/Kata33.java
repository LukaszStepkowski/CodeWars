public class Kata33 {
    public static String datingRange(int age) {
        int minAge = 0;
        int maxAge = 0;
        if (age <= 14) {
            minAge = (int)Math.floor(age - 0.1d * age);
            maxAge = (int)Math.floor(age + 0.1d * age);
        } else {
            minAge = (int)Math.floor(age / 2d + 7);
            maxAge = (int)Math.floor((age -7) * 2);
        }
        return String.valueOf(minAge) + "-" + String.valueOf(maxAge);
    }
}
