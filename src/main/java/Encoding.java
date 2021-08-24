import java.util.ArrayList;

public class Encoding extends MorseAlphabet {

    ArrayList<String> encoded = new ArrayList<>();

    public void encode(String morzeChar) {
        for (String key : MORSE.keySet()) {
            String value = MORSE.get(key);
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
