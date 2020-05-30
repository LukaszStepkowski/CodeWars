import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String, String> welcomeMap = new HashMap<>(){
            {
                put("english", "Welcome");
                put("czech", "Vitejte");
                put("danish", "Velkomst");
                put("dutch", "Welkom");
                put("estonian", "Tere tulemast");
                put("finnish", "Tervetuloa");
                put("flemish", "Welgekomen");
                put("french", "Bienvenue");
                put("german", "Willkommen");
                put("irish", "Failte");
                put("italian", "Benvenuto");
                put("latvian", "Gaidits");
                put("lithuanian", "Laukiamas");
                put("polish", "Witamy");
                put("spanish", "Bienvenido");
                put("swedish", "Valkommen");
                put("welsh", "Croeso");
            }
        };
        return (welcomeMap.containsKey(language)) ? welcomeMap.get(language) : "Welcome";
    }
}
