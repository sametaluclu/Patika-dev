import java.util.Scanner;
public class HesapMakinesi {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Hangi işlemi yapmak istiyorsunuz? (+,-,*,/): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0.0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 == 0) {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    } 
}
