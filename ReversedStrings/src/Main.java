
public class Main {
    public static void main(String[] args) {
        System.out.println(solution("olleH"));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str).reverse();
        return sb.toString();
    }
}
