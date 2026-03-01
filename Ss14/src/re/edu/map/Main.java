package re.edu.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map lưu cặp key, value(key - khoá là 1 Set<key>), giống Class
        // Map tương tự SET

        // 4 lớp triển khai
        // HashMap
        // LinkedHashMap
        // TreeMap
        // EnumMap

        Map<String, String> dictionary = new HashMap<>();
        // Cac phuong thuc lam viec
        dictionary.put("apple", "tao"); //them hoac sua
        dictionary.put("apple", "buoi"); // them hoac sua

        dictionary.remove("apple");

        String value=dictionary.get("apple");

        dictionary.containsKey("apple");
        dictionary.containsValue("tao");

        //duyet collection
        // 3 cach duyet

        // theo key
        for(String key:dictionary.keySet()){
            // lam viec voi key
        }

        // theo values
        for(String values:dictionary.values()){
            // lam viec duoc voi value
        }

        // theo ca 2
        for(Map.Entry<String, String > entry:dictionary.entrySet()){
            // lam viec
            String key=entry.getKey();
            String values=entry.getValue();
        }
    }
}
