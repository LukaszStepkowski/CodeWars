public class Kata32 {
    public static String remove(String s, int n){
        String[] split = s.split("");
        int counter = n;
        for (int i = 0; i < split.length && counter != 0; i++){
            if (split[i].equals("!")){
                split[i] = "";
                counter--;
            }
        }
        return String.join("", split);
    }
}
