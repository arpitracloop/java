import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String , String> language = new HashMap<>();

        language.put("Java","a compiled high level language");
        language.put("Python", "a inter-preted high level language");
        language.put("C","a high level language");
        language.put("SQL", "a structured query language");

//        System.out.println(language.get("Java"));
//        //language.put("Java","a programming language");
//
//        System.out.println(language.get("Java"));

        if(language.containsKey("Java"))
        {
            System.out.println("Java is already in the map");
        }
        else {
            language.put("Java", "now add java in map");
            System.out.println(language.get("Java"));
        }

        System.out.println("==================================");

        language.remove("SQL");
//        if(language.remove("Java","a compiled high level language"))
//        {
//            System.out.println("the key is removed");
//        }
//        else {
//            System.out.println("the key value pair not found");
//        }
//
        System.out.println(language.replace("Java","it is a replaced method of Map"));

        System.out.println("==================================");
        for (String key:language.keySet()
             ) {
            System.out.println(key + " : " + language.get(key));

        }
        System.out.println("==================================");

    }
}
