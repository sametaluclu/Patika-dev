import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gun, ay;

        // Kullanıcıdan doğum günü bilgilerini istiyoruz
        System.out.print("Doğduğunuz ayı giriniz (1-12): ");
        ay = scanner.nextInt();
        System.out.print("Doğduğunuz günü giriniz (1-31): ");
        gun = scanner.nextInt();

        // Burçları kontrol etmek için girilen ay ve günü tek bir tamsayı olarak ifade ediyoruz
        int tarih = ay * 100 + gun;

        // Koç burcu
        if (tarih >= 321 && tarih <= 419) {
            System.out.println("Koç burcusunuz");
        }
        // Boğa burcu
        else if (tarih >= 420 && tarih <= 520) {
            System.out.println("Boğa burcusunuz");
        }
        // İkizler burcu
        else if (tarih >= 521 && tarih <= 621) {
            System.out.println("İkizler burcusunuz");
        }
        // Yengeç burcu
        else if (tarih >= 622 && tarih <= 722) {
            System.out.println("Yengeç burcusunuz");
        }
        // Aslan burcu
        else if (tarih >= 723 && tarih <= 822) {
            System.out.println("Aslan burcusunuz");
        }
        // Başak burcu
        else if (tarih >= 823 && tarih <= 922) {
            System.out.println("Başak burcusunuz");
        }
        // Terazi burcu
        else if (tarih >= 923 && tarih <= 1022) {
            System.out.println("Terazi burcusunuz");
        }
        // Akrep burcu
        else if (tarih >= 1023 && tarih <= 1121) {
            System.out.println("Akrep burcusunuz");
        }
        // Yay burcu
        else if (tarih >= 1122 && tarih <= 1221) {
            System.out.println("Yay burcusunuz");
        }
        // Oğlak burcu
        else if (tarih >= 1222 || tarih <= 119) {
            System.out.println("Oğlak burcusunuz");
        }
        // Kova burcu
        else if (tarih >= 120 && tarih <= 218) {
            System.out.println("Kova burcusunuz");
        }
        // Balık burcu
        else if (tarih >= 219 && tarih <= 320) {
            System.out.println("Balık burcusunuz");
        }
        // Girilen tarih geçerli değilse hata mesajı gösteriyoruz
        else {
            System.out.println("Geçerli bir tarih giriniz.");
        }
    }
}
