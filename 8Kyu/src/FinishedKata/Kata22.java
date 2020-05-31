package FinishedKata;

public class Kata22 {
    static String greet(String name, String owner) {
        return "Hello " + ((name.equals(owner)) ? "boss" : "guest");
    }
}
