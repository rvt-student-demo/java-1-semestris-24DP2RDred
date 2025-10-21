package rvt;

import java.util.Scanner;

public class ex7_19 {
    public static void ex7_19() {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int len = word.length();
        for (int index = 0; index < len; index++) {
            System.out.println(word.charAt(index));
        }
    }
}
