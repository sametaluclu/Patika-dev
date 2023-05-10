import java.util.Scanner;

public class SayiSiralamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, sayi3;

        // Kullanıcıdan 3 sayıyı istiyoruz
        System.out.println("3 sayi giriniz: ");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();
        sayi3 = scanner.nextInt();

        // İlk olarak, en küçük sayıyı buluyoruz
        int min = sayi1;
        if (sayi2 < min) {
            min = sayi2;
        }
        if (sayi3 < min) {
            min = sayi3;
        }

        // Sonra, en büyük sayıyı buluyoruz
        int max = sayi1;
        if (sayi2 > max) {
            max = sayi2;
        }
        if (sayi3 > max) {
            max = sayi3;
        }

        // Ortadaki sayıyı da, diğer iki sayının toplamından çıkararak buluyoruz
        int ortanca = sayi1 + sayi2 + sayi3 - min - max;

        // Son olarak, sayıları küçükten büyüğe sıralayarak ekrana yazdırıyoruz
        System.out.println("Sayilarin siralanisi: " + min + " < " + ortanca + " < " + max);
    }
}
