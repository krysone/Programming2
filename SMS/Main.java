package SMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a message to be shorten");
        Scanner in = new Scanner(System.in);
        String sms = in.nextLine();

        SMS.smsShorten(sms);
    }
}
