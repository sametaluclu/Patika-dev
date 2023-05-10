import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayisi giriniz: ");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) { // i değişkeni basamak sayısından başlayarak 1'e kadar dönecek
            for (int j = 1; j <= i; j++) { // j değişkeni 1'den i'ye kadar dönecek
                System.out.print("*"); // her bir yıldızı ekrana yazdır
            }
            System.out.println(); // her bir satırın sonunda alt satıra geç
        }
    }
}
