import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi, biletSayisi;

        double ucret, indirimOrani, indirimliTutar, yasIndirimi, yolculukTipiOrani, yolculukTipiTutari, toplamTutar;

        ucret = 0.10;
        biletSayisi = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe giriniz: ");
        mesafe = input.nextInt();

        if(mesafe <= 0) {
            System.out.println("Hatalı veri girdiniz! Tekrar deneyin.");
        }

        System.out.print("Yaş giriniz: ");
        yas = input.nextInt();

        if(yas <= 0) {
            System.out.println("Hatalı veri girdiniz! Tekrar deneyin. Yaş");
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) ");
        yolculukTipi = input.nextInt();

        if(yolculukTipi < 1 || yolculukTipi > 2) {
            System.out.println("Hatalı veri girdiniz! Tekrar deneyin. Seçim");
        }

        double normalTutar = mesafe * ucret;

        if (yas < 12) {
            indirimOrani = 0.50;
        } else if (yas >= 12 && yas < 24){
            indirimOrani = 0.10;
        } else if(yas > 65 ) {
            indirimOrani = 0.30;
        } else {
            indirimOrani = 0;
        }

        yasIndirimi = normalTutar * indirimOrani;
        indirimliTutar = normalTutar - yasIndirimi;

        if (yolculukTipi == 2){
            yolculukTipiOrani = 0.20;
            biletSayisi = 2;
        }else {
            yolculukTipiOrani = 0;
        }

        yolculukTipiTutari = indirimliTutar *  yolculukTipiOrani;

        toplamTutar = indirimliTutar - yolculukTipiTutari;

        System.out.print("Toplam tutar: " + toplamTutar*biletSayisi + " TL");




    }
}
