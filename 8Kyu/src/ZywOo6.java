public class ZywOo6 {
    public static String warnTheSheep(String[] array) {
        int wolfIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals("wolf")){
                wolfIndex = i;
            }
        }
        return wolfIndex == array.length - 1 ? "Pls go away and stop eating my sheep" :
                "Oi! Sheep number " + (array.length - wolfIndex - 1) + "! You are about to be eaten by a wolf!";
    }
}
