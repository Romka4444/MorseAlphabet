/*
For print HashMap
 */

public class PrintHashMap extends MorseAlphabet {

    public void printHashMap(MorseAlphabet Alphabet) {
        System.out.println("----------MORSE ALPHABET----------");
        for (String key : MORSE.keySet()) {
            String value = MORSE.get(key);
            System.out.println(key + " ---> " + value);
        }
        System.out.println("----------SINGLE SPACE FOR SEPARATE CHARS AND 3 SPACES FOR SEPARATE WORDS----------");
        System.out.println("----------ENTER MORSE SYMBOLS AND PRESS ENTER TWICE----------");
    }
}
