import java.util.Scanner;

public class BolumuneTamBolunenOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, count = 0;
        double average;
        
        System.out.print("Bir sayı girin: ");
        n = input.nextInt();
        
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("3 ve 4'e tam bölünen bir sayı yok.");
        } else {
            average = (double)sum / count;
            System.out.println("Ortalama: " + average);
        }
    }
}
