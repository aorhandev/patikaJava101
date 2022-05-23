import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, minTutar, acilisTutar;
        double kmUcret, tutar, odenecekTutar;
        acilisTutar = 10;
        minTutar = 20;
        kmUcret = 2.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz(KM cinsinden): ");
        km = input.nextInt();

        tutar = acilisTutar + (kmUcret * km);

        if(tutar <= 20) {
            odenecekTutar = minTutar ;
        }else {
            odenecekTutar = tutar;
        }

        System.out.print("Toplam tutar: " + odenecekTutar);

    }
}
