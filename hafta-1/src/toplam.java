import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;
        
        do {
            System.out.print("Bir sayı girin: ");
            sayi = input.nextInt();
            
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 == 0 || sayi % 4 != 0);
        
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
