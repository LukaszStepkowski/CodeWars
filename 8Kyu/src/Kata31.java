public class Kata31 {
    public static int grow(int[] x){
        int opt = x[0];
        for (int i = 1; i < x.length; i++){
            opt *= x[i];
        }
        return opt;
    }
}
