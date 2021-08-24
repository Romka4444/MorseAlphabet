import java.util.HashMap;

public class MorseAlphabet {

    public static HashMap<String, String> MORSE = new HashMap<String, String>();

    public void MorseAlphabet () {
        MORSE.put("A", ".-");
        MORSE.put("B", "-...");
        MORSE.put("C", "-.-.");
        MORSE.put("D", "-..");
        MORSE.put("E", ".");
        MORSE.put("F", "..-.");
        MORSE.put("G", "--.");
        MORSE.put("H", "....");
        MORSE.put("I", "..");
        MORSE.put("J", ".---");
        MORSE.put("K", "-.-");
        MORSE.put("L", ".-..");
        MORSE.put("M", "--");
        MORSE.put("N", "-.");
        MORSE.put("O", "---");
        MORSE.put("P", ".--.");
        MORSE.put("Q", "--.-");
        MORSE.put("R", ".-.");
        MORSE.put("S", "...");
        MORSE.put("T", "-");
        MORSE.put("U", "..-");
        MORSE.put("V", "...-");
        MORSE.put("W", ".--");
        MORSE.put("X", "-..-");
        MORSE.put("Y", "-.--");
        MORSE.put("Z", "--..");
        MORSE.put(" ", ""); //
        MORSE.put("   ", " "); //words separate
        MORSE.put(".", ".-.-.-");
        MORSE.put(",", "--..--");
    }
}
