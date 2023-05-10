import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Girin: ");
        int sayi1 = input.nextInt();

        System.out.print("2. Sayıyı Girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2); // EKOK için ilk değer olarak sayıların çarpımı alınır

        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) { // i, sayi1 ve sayi2'ye tam bölünüyorsa
                ebob = i; // ebob değerine atanır

                // ekok değeri i'ye bölündüğünde kalanı sıfırsa ve
                // i, sayi1 ve sayi2'ye tam bölündüğünde kalanı sıfırsa
                // ekok değeri i'ye eşitlenir
                if ((ekok % i == 0) && (i % sayi1 == 0) && (i % sayi2 == 0)) {
                    ekok = i;
                }
            }
            i++;
        }

        System.out.println(sayi1 + " ve " + sayi2 + " Sayılarının EBOB Değeri: " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " Sayılarının EKOK Değeri: " + ekok);
    }
}
