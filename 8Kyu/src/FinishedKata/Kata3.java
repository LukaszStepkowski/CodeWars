package FinishedKata;

public class Kata3 {
    public static String buildString(String... args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("I like ");
        for (int i = 0; i < args.length -1; i++){
            sb.append(args[i]).append(", ");
        }
        return sb.append(args[args.length -1]).append("!").toString();
    }
}
