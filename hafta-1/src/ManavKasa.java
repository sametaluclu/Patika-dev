import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutKiloFiyat = 2.14;
        double elmaKiloFiyat = 3.67;
        double domatesKiloFiyat = 1.11;
        double muzKiloFiyat = 0.95;
        double patlicanKiloFiyat = 5.00;

        System.out.print("Armut kaç kilogram? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilogram? : ");
        double patlicanKilo = input.nextDouble();

        double toplamTutar = armutKilo * armutKiloFiyat + elmaKilo * elmaKiloFiyat +
                domatesKilo * domatesKiloFiyat + muzKilo * muzKiloFiyat +
                patlicanKilo * patlicanKiloFiyat;

        System.out.println("Toplam tutar: " + toplamTutar + " TL");
    } 
}
