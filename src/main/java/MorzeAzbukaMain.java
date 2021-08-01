import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
Encoding from characters to MORZE code
 */

public class MorzeAzbukaMain extends MorzeAlphabet {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        //read from console
        System.out.println("Enter Morze' symbols: ");

        while (list.size() < 3) {
            String value = console.readLine();
            list.add(value);
        }


        MorzeAlphabet Alphabet = new MorzeAlphabet();//fill hash map
        Alphabet.MorzeAlphabet();

        Encoding Encode = new Encoding();
        for (String morzeChar : list) {
            Encode.encode(morzeChar);
        }

        Encode.printResult(Encode.encoded);

//        PrintHashMap ob = new PrintHashMap();
//        ob.printHashMap(Alphabet);



    }
}
