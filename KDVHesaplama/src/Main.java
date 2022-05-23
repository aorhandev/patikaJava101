import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar;
        double kdv;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");

        tutar = scanner.nextInt();

        if (tutar <= 1000) {
            kdv = 1.18;
        } else {
            kdv = 1.08;
        }

        double sonuc = tutar * kdv ;

        System.out.println("KDV'siz Fiyat= " + tutar);
        System.out.println("KDV'li Fiyat= " + sonuc);
        System.out.println("KDV tutarı= " + (sonuc - tutar));

    }

}
