import java.util.Scanner;

public class kdv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün fiyatını girin: ");
        double fiyat = input.nextDouble();

        double kdvOrani = (fiyat > 1000) ? 0.08 : 0.18;

        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }

}
