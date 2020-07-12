import java.util.HashMap;

public class hashmap {
    
    public static void main(String[] args) {
        HashMap <String, String> map1 = new HashMap<String, String>();
        map1.put("India", "Delhi");
        map1.put("Spain", "Madrid");
        map1.put("Germany", "Berlin");
        map1.put("England", "london");

        System.out.println(map1.get("Germany"));
        System.out.println(map1);
    }
}