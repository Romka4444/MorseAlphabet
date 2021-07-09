import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class PrintHashMap {
    public static void printHashMap(HashMap<String, String> hashMap) {
        HashMap entrySet = new HashMap();
        Set<Map.Entry<String, String>> entries = HashMap.entrySet();
        for (Map.Entry<String, String> pair:entries) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "-->" + value);
        }
    }
}
