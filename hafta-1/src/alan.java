import java.util.Scanner;
public class alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz: ");
    double a = input.nextDouble();

    System.out.print("Üçgenin 2. kenarını giriniz: ");
    double b = input.nextDouble();1

    System.out.print("Üçgenin 3. kenarını giriniz: ");
    double c = input.nextDouble();

    double u = (a + b + c) / 2;
    double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

    System.out.println("Üçgenin alanı: " + alan);
}
}
