import java.util.Scanner;
public class RecursiveUs {
    static int uslu(int taban,int us){
        int sonuc=1;
        if(us==0 || taban==1){
            return 1;
        }else {
            sonuc *= taban;
        }
        return sonuc*uslu(taban,us-1) ;
    }
    public static void main(String[] args){
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("Taban sayisini giriniz:");
        a= input.nextInt();
        System.out.print("Uslu sayisini giriniz:");
        b= input.nextInt();

        System.out.println("SONUC:"+uslu(a,b));

    }
}
