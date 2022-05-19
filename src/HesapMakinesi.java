import java.util.Scanner;
public class HesapMakinesi {

    static void toplama(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int n2=input.nextInt();
        int sonuc=n1+n2;
        System.out.println("SONUC:"+sonuc);
    }

    static void cikarma(){
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int n2=input.nextInt();
        int sonuc=n1-n2;
        System.out.println("SONUC:"+sonuc);
    }

    static void carpma(){
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int n2=input.nextInt();
        int sonuc=n1*n2;
        System.out.println("SONUC:"+sonuc);
    }

    static void bolme(){
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int n2=input.nextInt();
        if(n2==0){
            System.out.println("2. sayi 0'dan büyük olmalidir.");
        }else {
            int sonuc = n1 / n2;
            System.out.println("SONUC:" + sonuc);
        }
    }

    static void uslu(){
        Scanner input=new Scanner(System.in);
        System.out.print("Taban sayisini giriniz:");
        int n1=input.nextInt();
        System.out.print("Ust sayisini giriniz:");
        int n2=input.nextInt();
        int sonuc=1;
        for(int i=1;i<=n2;i++){
            sonuc*=n1;
        }
        System.out.println("SONUC:"+sonuc);
    }

    static void faktoriyel(){
        Scanner input=new Scanner(System.in);
        System.out.print("Faktoriyel sayiyisini giriniz:");
        int n1=input.nextInt();
        int sonuc=1;
        for(int i=1;i<=n1;i++){
            sonuc*=i;
        }
        System.out.println("SONUC:"+sonuc);
    }

    static void mod(){
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("2. sayiyi giriniz:");
        int n2=input.nextInt();
        if(n2==0){
            System.out.println("2. sayi 0'dan buyuk olmalidir");
        }else {
            int sonuc = n1 % n2;
            System.out.println("SONUC:" + sonuc);
        }
    }

    static void dikdortgen(){
        Scanner input=new Scanner(System.in);
        System.out.print("a kenarini giriniz:");
        int a=input.nextInt();
        System.out.print("b kenarini giriniz:");
        int b=input.nextInt();
        int sonucCevre=2*(a+b);
        int sonucAlan=a*b;
        System.out.println("Dikdortgen Cevresi:"+sonucCevre);
        System.out.println("Dikdortgen Alan:"+sonucAlan);
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir Islem Seciniz:");
            select = input.nextInt();

            if (select == 0) {
                System.out.println("GULE GULE");
                break;
            }

            switch (select) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    uslu();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;

                default:
                    System.out.println("Yanlis Bir Secim Yaptiniz");
            }
        }
    }
}
