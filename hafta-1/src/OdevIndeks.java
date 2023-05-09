import java.util.Scanner;
public class OdevIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double length = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double weight = input.nextDouble();

        double vki = weight / (length * length);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
