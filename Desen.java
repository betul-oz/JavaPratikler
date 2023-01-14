import java.util.Scanner;

public class Desen {
    

    static int method1(int a, int n){
            if (n > 0 && a >0){
                System.out.print(n  + " ");
                n-=5; 
                return method1(a , n);
              
            }
            return method2(a, n);

    }

    static int method2(int a, int n){
            if (n < a) {
            System.out.print(n  + " ");
                n+=5;

                return method2(a, n);
           }
           return a;
    }


    

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
         
        int n;
         do {
            System.out.print("n sayısını giriniz: ");
            n = input.nextInt();  
            int a = n;
            method1(a, n);
            System.out.print(n);
            System.out.println();
        } while (n > 0);
         

    }
}
