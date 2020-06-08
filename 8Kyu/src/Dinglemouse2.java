public class Dinglemouse2 {

    private static int ONE_HUNDRED = 100;

    private final int value;

    private Dinglemouse2() {
       value = ONE_HUNDRED;
    }

    public static final Dinglemouse2 INST = new Dinglemouse2();

    public int plus100(int n) {
        return value + n;
    }
}
