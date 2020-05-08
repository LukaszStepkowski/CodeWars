public class Main {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("HeLLO WORLD"));
    }

    public static String toAlternativeString(String string) {

        char[] stringToCharArray = string.toCharArray();
        for (Character character : stringToCharArray) {
            if (character > 96 && character < 123) {
                character = Character.toUpperCase(character);
            } else if (character > 64 && character < 91) {
                character = Character.toLowerCase(character);
            }
        }

        String charArrayBackToString = new String(stringToCharArray);

        return charArrayBackToString;
    }
}
