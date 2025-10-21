package rvt;
import java.util.Random;
import java.util.Scanner;

public class spele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random( );

        int secret = rand.nextInt(10) + 1;
        int attemps = 3;

        System.out.println("Es domaju par skaitli no 1 lidz 10");
        System.out.println("Tev tas jauzmin tris meginajumos");

        for  (int i = 1; i <= attemps; i++) {
            System.out.println("Ievadi skaitli");
            int guess = scan.nextInt();

            if (guess == secret) {
                System.out.println("Pareizi");
                System.out.println("Tu esi uzvarejis");
                scan.close();
                return;
            } else {
                System.out.println("Nepareizi");
            }
        }

        System.out.println("Tu zaudeji Skaitlis bija " + secret);
        scan.close();
    }
}
