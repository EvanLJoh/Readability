package Java2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Coleman-Liau index. Input text here: ");
        String text = input.nextLine();

        int lCount = 0;
        int wCount = 1;
        int sCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                lCount++;
        }

        for (int j = 0; j < text.length(); j++) {
            if(text.charAt(j) == ' ')
                wCount ++;
        }

        for (int k = 0; k < text.length(); k++) {
            if (text.charAt(k) == '.' || text.charAt(k) == '?' || text.charAt(k) == '!' )
                sCount++;
        }

        System.out.println(lCount + " letter(s)");
        System.out.println(wCount + " word(s)");
        System.out.println(sCount + " sentence(s)");

        double level = (double)lCount / (double)wCount * 100;
        double sentence = (double)sCount / (double)wCount * 100;
        double index = 0.0588 * level - 0.296 * sentence - 15.8;

        if (index >= 16) {
            System.out.println("Grade 16+");
        }

        if (index < 1) {
            System.out.println("Before Grade 1");
        }

        else {
            System.out.println("Grade " + Math.round(index));
        }
    }
}


