public class Main {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("HeLLO WORLD"));
    }

    public static String toAlternativeString(String string) {

        char[] stringToCharArray = string.toCharArray();
        for (int i = 0; i < stringToCharArray.length; i++) {
            if (stringToCharArray[i] > 96 && stringToCharArray[i] < 123){
                stringToCharArray[i] -= 32;
            } else
            if (stringToCharArray[i] > 64 && stringToCharArray[i] < 91){
                stringToCharArray[i] += 32;
            }
        }

        String charArrayBackToString = new String(stringToCharArray);

        return charArrayBackToString;
    }
}
