import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c; // n: fibonacci serisinde kaç adet sayı istendiği, a ve b: fibonacci serisinin ilk iki elemanı
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet Fibonacci sayısı hesaplamak istiyorsunuz? ");
        n = input.nextInt();
        System.out.println(n + " adet Fibonacci sayısı:");
        for (int i = 1; i <= n; i++) { // n adet fibonacci sayısı hesaplanacak
            System.out.print(a + " "); // her eleman ekrana yazdırılıyor
            c = a + b; // her eleman önceki iki elemanın toplamıdır
            a = b; // sonraki eleman için önceki ikinci eleman, önceki birinci eleman olur
            b = c; // sonraki eleman için önceki eleman, şimdiki eleman olur
        }
    }
}
