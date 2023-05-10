import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;
        double normalTutar, indirimliTutar, yasIndirimi = 0, yolculukIndirimi = 0, toplamTutar;
        //Veriler alınır
        System.out.print("Mesafe (KM): ");
        mesafe = input.nextInt();
        
        System.out.print("Yaşınız: ");
        yas = input.nextInt();
        
        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();
        //Veri Hatası Kontrol Edilir
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        //Normal Tutar Hesaplanır
        normalTutar = mesafe * 0.10;
        // Yasa Göre İndirim uygulanır
        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50;
        } else if (yas <= 24) {
            yasIndirimi = normalTutar * 0.10;
        } else if (yas >= 65) {
            yasIndirimi = normalTutar * 0.30;
        }
        //Yas İndirimi Düşülür
        indirimliTutar = normalTutar - yasIndirimi;

        //Yolculuk Tipine Göre İndirim Yapılır

        if (yolculukTipi == 2) {
            yolculukIndirimi = indirimliTutar * 0.20;
            toplamTutar = (indirimliTutar - yolculukIndirimi) * 2;
        } else {
            toplamTutar = indirimliTutar;
        }
        //Toplam Tutar Yazdırılır
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
