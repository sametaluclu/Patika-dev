import java.util.Scanner;

public class EtkinlikOnerisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sicaklik;

        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        sicaklik = scanner.nextInt();

        // Sıcaklık 5'den küçükse "Kayak" yapmayı öner.
        if (sicaklik < 5) {
            System.out.println("Hava çok soğuk, Kayak yapabilirsiniz.");
        }
        // Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Hava serin, Sinemaya gidebilirsiniz.");
        }
        // Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Hava güzel, Piknik yapabilirsiniz.");
        }
        // Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        else {
            System.out.println("Hava sıcak, Yüzmeye gidebilirsiniz.");
        }
    }
}
