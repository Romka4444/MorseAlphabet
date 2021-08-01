import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class PrintHashMap extends MorzeAlphabet {
    public void printHashMap(MorzeAlphabet Alphabet) {
        System.out.println("----------MORZE ALPHABET----------");
        for (String key : MORZE.keySet()) {
            String value = MORZE.get(key);
            System.out.println(key + " ---> " + value);
        }
    }
}
