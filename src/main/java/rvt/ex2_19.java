package rvt;

import java.util.Scanner;

public class ex2_19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter N: ");
        int entern = reader.nextInt();

        int sum = (entern*(entern+1))/2;

        int loopsum = 0;
        
        while (entern > 0) {
            loopsum = loopsum + entern;
            entern = entern - 1;
        }

        System.out.println("Loop Sum: " + loopsum);
        System.out.println("Formula Sum: " + sum);

        reader.close();
    }
    
}
