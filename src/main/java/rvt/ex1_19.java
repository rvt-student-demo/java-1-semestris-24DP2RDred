package rvt;

import java.util.Scanner;

public class ex1_19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Start: ");
        int enterstart = reader.nextInt();

        System.out.println("Enter End: ");
        int enterend = reader.nextInt();

        while (enterstart <= enterend) {
            System.out.println(enterstart);
            enterstart = enterstart + 1;
        }

        reader.close();
    }
}
