public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length; i > 0; i--){
            sb.append(words[i-1]).append(" ");
        }
        return sb.toString().trim();
    }
}
