public class AsalSayi {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        // 2'den 100'e kadar olan tüm sayıları kontrol et
        for (i = 2; i <= 100; i++) {
            isPrime = true;

            // mevcut sayıyı kendinden önceki tüm sayılara bölmek için iç bir döngü oluşturun
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // eğer sayı kendisinden önceki hiçbir sayıya tam olarak bölünemezse, o zaman asaldır ve ekrana yazdırın
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
