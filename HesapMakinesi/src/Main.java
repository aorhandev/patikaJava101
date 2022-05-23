import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2, secim;

        Scanner input =new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1=input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1- Toplam\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        secim=input.nextInt();


        switch (secim){
            case 1:
                System.out.print("Toplam: " + (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma: " + (sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma: " + (sayi1*sayi2));
                break;
            case 4:
                if(sayi2!=0){
                    System.out.print("Bölme: " + (sayi1/sayi2));
                }else {
                    System.out.print("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.print("Yanlış seçim, lütfen kontrol ediniz!");
        }
    }

}