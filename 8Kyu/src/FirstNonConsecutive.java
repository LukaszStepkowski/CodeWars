public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        Integer prev = array[0];
        Integer first = null;
        for (Integer i = 1; i < array.length; i++){
            if ((prev+1) != array[i]){
                    first = array[i];
                    break;
            }
            prev++;
        }
        return first;
    }
}
