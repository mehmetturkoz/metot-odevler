import java.util.Scanner;
public class recursiveAsal {
    static int asalnNumber(int number,int i){
        if(i==1){
            return 1;
        }else if(number%i==0) {
            return 0;
        }else{
           return asalnNumber(number,i-1);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number= input.nextInt();

        if(asalnNumber(number,number/2)==1){
            System.out.println("Asaldır.");
        }else{
            System.out.println("Asal değildir.1");
        }


    }
}
