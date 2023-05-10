import java.util.Scanner;

public class Kuvvetler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i++) {
            int kuvvet4 = (int) Math.pow(4, i);
            int kuvvet5 = (int) Math.pow(5, i);
            System.out.println(kuvvet4 + " " + kuvvet5);
        }
    }
}
