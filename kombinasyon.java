import java.util.Scanner;

public class kombinasyon {

    static int factorial(int num){
        int fact=1;
        for (int i=1; i <=num; i++){
            fact= fact*i;
        }
        return fact;
    }

    static int combin(int n, int r){ 
        int com = factorial(n) / (factorial(r)*factorial(n - r));
        return com;
    }

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Sırasıyla n ve r sayılarını giriniz:");
    int n, r;
    n = input.nextInt();
    r = input.nextInt();

    combin(n, r) ;
    System.out.println(combin(n, r));
    }
}
