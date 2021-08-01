import java.util.ArrayList;

public class Encoding extends MorzeAlphabet {
    //public String result;
    ArrayList<String> encoded = new ArrayList<>();

    public void encode(String morzeChar) {



        for (String key : MORZE.keySet()) {
            String value = MORZE.get(key);
            if (value.equals(morzeChar)) {
                encoded.add(key);
            }
        }
    }
    public void printResult(ArrayList<String> encoding) {
        System.out.println("Encoded: ");
        for (String value : encoding) {
            System.out.print(value);
        }
    }
}
