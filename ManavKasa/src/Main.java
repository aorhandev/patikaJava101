import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican ,tutar;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        armutKilo = input.nextInt();

        System.out.print("Elma kaç kilo ? :");
        elmaKilo = input.nextInt();

        System.out.print("Domates kaç kilo ? :");
        domatesKilo = input.nextInt();

        System.out.print("Muz kaç kilo ? :");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKilo = input.nextInt();

        tutar = (armut * armutKilo) + (elma* elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlicanKilo * patlican);
        System.out.print("Toplam tutar: " + tutar + " TL");

    }
}
