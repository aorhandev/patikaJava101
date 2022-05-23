import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, pass, yeniParola;
        Scanner input = new Scanner(System.in);
        int secim1;

        System.out.print("Kullanıcı adınız: ");
        kullaniciAdi = input.nextLine();

        System.out.print("Şifreniz: ");
        pass = input.nextLine();

        if(kullaniciAdi.equals("patika") && pass.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Giriş Yapılamadı!");

            System.out.println("Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("Sıfırlamak için 1'e basınız.");
            System.out.println("İstemiyorsanız 2'ye basınız.");

            secim1 = input.nextInt();

            switch (secim1){
                case 1:
                    System.out.print("Yeni parola giriniz: ");
                    yeniParola = input.next();

                    if(yeniParola.equals("java123") || yeniParola.equals(pass)){
                        System.out.println("Yeni Parolanız eski parolanızla aynı veya hatalı parola ile aynı. Bu nedenle sıfırlanmadı.");
                    }
                    else {
                        System.out.println("Tebrikler Parolanız Sıfırlandı" );
                        System.out.println("Yeni Parolanız: " + yeniParola );
                    }
                    break;
                case 2:
                    System.out.println("Parolanızı Sıfırlanmak istemediniz." );
                    break;
                default:
                    System.out.println("Lütfen '1' veya '2' değerlerinden birini giriniz.");
            }


        }
    }
}
