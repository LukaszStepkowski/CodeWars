public class Swapper{

    public static void main(String[] args) {
        Integer[] argums = new Integer[]{1, 2};

        Swapper sw = new Swapper(argums);
        sw.swapValues();
        System.out.println(sw.arguments[0]);
        System.out.println(sw.arguments[1]);
    }

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}