import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yaricap;
        double pi,alan,cevre;

        pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap giriniz: ");
        yaricap = input.nextInt();

        cevre = 2 * pi * yaricap;
        alan = pi * yaricap * yaricap;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);

    }
}
