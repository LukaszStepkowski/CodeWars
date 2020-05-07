public class Main {
    public static void main(String[] args) {
        System.out.println(abbrevName("sAM hARRIS"));
    }

    public static String abbrevName(String name) {
        name = name.replaceAll("\\B[a-zA-Z]", "")
                .replaceAll(" ", ".")
                .toUpperCase();
        return name;
    }
}
