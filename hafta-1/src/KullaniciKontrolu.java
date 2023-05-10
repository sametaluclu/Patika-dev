import java.util.Scanner;

public class KullaniciKontrolu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi, sifre;

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = scanner.nextLine();

        if (kullaniciAdi.equals("admin") && sifre.equals("12345")) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
