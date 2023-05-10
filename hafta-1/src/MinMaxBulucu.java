import java.util.Scanner;

public class MinMaxBulucu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz?: ");
        int n = input.nextInt();

        // ilk sayıyı hem en küçük hem de en büyük olarak kabul ediyoruz
        System.out.print("1. Sayıyı girin: ");
        int min = input.nextInt();
        int max = min;

        // diğer sayıları kontrol ediyoruz
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı girin: ");
            int num = input.nextInt();

            // en küçük sayıyı güncelliyoruz
            if (num < min) {
                min = num;
            }

            // en büyük sayıyı güncelliyoruz
            if (num > max) {
                max = num;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
