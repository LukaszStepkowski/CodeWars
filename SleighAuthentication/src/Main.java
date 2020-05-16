public class Main {
    public static void main(String[] args) {

    }

    public static Boolean authenticate(String name, String password){
        if (name.equals("Santa Claus") && password.equals("Ho Ho Ho!")){
            return true;
        } else return false;
    }
}
