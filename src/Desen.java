import java.util.Scanner;
public class Desen {

    static int recursiveDesen(int n){
        if (n <= 0) {
            return n;
        }else{
            System.out.print(n+" ");
        }
        return recursiveDesen(n-5);
    }

    static int recursiveDesen(int n,int m){
        if(n>m){
            return n;
        }else{
            System.out.print(n+" ");
            return recursiveDesen(n+5,m);
        }
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Bir deger giriniz:");
        int number= input.nextInt();

        recursiveDesen(recursiveDesen(number),number);


    }
}
