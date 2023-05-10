import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Veri alırız
        System.out.print("Yıl Girin: ");
        int yil = input.nextInt();
        //Gerekli Hesaplamaları yapıp sonucu yazdırıırz.
        if ((yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }
    }
}
