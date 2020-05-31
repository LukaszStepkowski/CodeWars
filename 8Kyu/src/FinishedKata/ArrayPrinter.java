package FinishedKata;

import java.util.Arrays;

public class ArrayPrinter {
    public static String printArray(Object array[]) {
        StringBuilder sb = new StringBuilder();
        for (Object o : array){
            sb.append(o).append(",");
        }
        return sb.toString().substring(0, sb.length()-1);
    }
}
