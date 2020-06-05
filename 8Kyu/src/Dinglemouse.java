public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] opt = new int[3];
        opt[0] = humanYears;
        if (humanYears == 1){
            opt[1] = 15;
            opt[2] = 15;
        } else if (humanYears == 2){
            opt[1] = 24;
            opt[2] = 24;
        } else {
            opt[1] = 24 + (humanYears - 2) * 4;
            opt[2] = 24 + (humanYears - 2) * 5;
        }

        return opt;
    }
}
