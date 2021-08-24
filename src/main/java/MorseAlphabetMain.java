import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Encoding from characters to MORSE code
 */

public class MorseAlphabetMain extends MorseAlphabet {

    public static void main(String[] args) throws IOException {
        String[] morseSymbols = null;
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        MorseAlphabet Alphabet = new MorseAlphabet();//fill hash map
        Alphabet.MorseAlphabet();

        PrintHashMap ob = new PrintHashMap();
        ob.printHashMap(Alphabet);

        //read from console
        System.out.println("Enter Morse' symbols: ");
        while (true) {
            String value = console.readLine();
            if (value.equals("")) {
                break;
            }
            morseSymbols = value.split(" ");
        }

        Encoding Encode = new Encoding();
        for (String morseChar : morseSymbols) {
            Encode.encode(morseChar);
        }

        Encode.printResult(Encode.encoded);
    }
}
