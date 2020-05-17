public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {
        StringBuilder sb = new StringBuilder();
        if (toRepeat instanceof String){
            for (int i = 0; i < n; i++) {
                sb.append(toRepeat);
            }
            return sb.toString();
        } else return "Not a string";
    }

}