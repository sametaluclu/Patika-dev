import java.util.Scanner;

public class GecmeDurumu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double matematik, fizik, turkce, kimya, muzik;
        double ortalama;

        System.out.print("Matematik notunu giriniz: ");
        matematik = scanner.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        fizik = scanner.nextDouble();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = scanner.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        kimya = scanner.nextDouble();

        System.out.print("Müzik notunu giriniz: ");
        muzik = scanner.nextDouble();

        ortalama = (matematik + fizik + turkce + kimya + muzik) / 5;

        if (ortalama >= 55) {
            System.out.println("Ortalamanız: " + ortalama + " - Geçtiniz!");
        } else {
            System.out.println("Ortalamanız: " + ortalama + " - Kaldınız!");
        }
    }
}
