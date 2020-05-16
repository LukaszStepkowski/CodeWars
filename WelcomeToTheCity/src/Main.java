public class Main {
    public static void main(String[] args) {
        String[] name = {"John", "Smith"};
        System.out.println(sayHello(name, "Phoenix", "Arizona"));
    }

    public static String sayHello(String [] name, String city, String state){
        StringBuilder sb = new StringBuilder();
        StringBuilder output = new StringBuilder();
        for (String string : name) {
            sb.append(string).append(" ");
        }
        String fullName = sb.toString().trim();

        output.append("Hello, ")
                .append(fullName)
                .append("! Welcome to ")
                .append(city)
                .append(", ")
                .append(state)
                .append("!");

        return output.toString();
    }
}
