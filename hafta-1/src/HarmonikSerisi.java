import java.util.Scanner;

public class HarmonikSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        double harmonikToplam = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonikToplam += (1.0 / i);
        }

        System.out.println(n + " sayısının harmonik serisi: " + harmonikToplam);
    }
}
