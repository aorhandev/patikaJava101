import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, kitle;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (mere cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo= input.nextDouble();

        kitle = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + kitle);

    }
}
