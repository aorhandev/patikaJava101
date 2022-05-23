import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tutar;
        double kdv;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutarı giriniz: ");

        tutar = scanner.nextInt();

        if (tutar <= 1000) {
            kdv = 1.8;
        } else {
            kdv = 0.8;
        }

        System.out.println("KDV'siz Fiyat= " + tutar);
        System.out.println("KDV'li Fiyat= " + (tutar * kdv));
        System.out.println("KDV tutarı= " + kdv);

    }

}
