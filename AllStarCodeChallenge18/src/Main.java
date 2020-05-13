public class Main {
    public static void main(String[] args) {
        System.out.println(strCount("Hello", 'z'));
    }

    public static int strCount(String str, char letter) {
        int count = 0;

        char[] chars = str.toCharArray();

        for (Character character : chars){
            if (character.equals(letter)){
                count++;
            }
        }

        return count;
    }
}
