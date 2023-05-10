import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        long kombinasyon = 1; // long tipinde tanımlanmalıdır, çünkü sonuç büyük sayılar olabilir.

        System.out.print("n değerini girin: ");
        n = input.nextInt();

        System.out.print("r değerini girin: ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            kombinasyon *= n - r + i;
            kombinasyon /= i;
        }

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }
}
