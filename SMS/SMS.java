package SMS;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class SMS {

    public static String smsShorten(String sms) {
        char toDelete = ' ';
        char[] smsCharTable = sms.toCharArray();
        String word;
        ArrayList<Character> words = new ArrayList<>();
        boolean wordEnd = false;
        for (int i = 0; i < smsCharTable.length; i++) {
            if (smsCharTable[i] == toDelete) {
                wordEnd = true;
            } else {
                if (wordEnd == true) {
                    smsCharTable[i] = Character.toUpperCase(smsCharTable[i]);
                    wordEnd = false;
                }
                words.add(smsCharTable[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character e : words) {
            sb.append(e);
        }
        String shortenSms = sb.toString();

//        System.out.println(words);
        System.out.println(shortenSms);
        return null;
    }

}
