import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c,alan;

        Scanner input  = new Scanner(System.in);
        System.out.print("a Kenar Ölçüsü: ");
        a = input.nextInt();

        System.out.print("b Kenar Ölçüsü: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

        alan = a*b/2;
        System.out.print("Alan: " + alan);


    }
}
