import java.util.Scanner;

public class perfectnumber {
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Sayı giriniz:");
            int n = input.nextInt();
            int total = 0;


                for (int i=1; i < n; i++) {
                    
                    if (n%i==0){
                       total += i;
                    } 

                }

                if ( n == total){
                    System.out.println(n + " is a " + "Perfect Number!");
                }else {
                    System.out.println(n + " " + "is not a Perfect Number");
                }

  }  
}
