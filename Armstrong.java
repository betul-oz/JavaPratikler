import java.util.Scanner;
import java.lang.Math;
public class Armstrong {

    public static boolean count(int number) {  
        int basamak = 0; 
        int toplam = 0; 
        int num1 = number;
        int num2 = number;
        while(num1 != 0) {   
            num1 = num1 / 10;   
            basamak = basamak + 1;  
            }  
        while(number != 0) {   
        int dec = 0;
        dec = number%10;
        toplam += Math.pow(dec,basamak);
        number = number / 10;    
        }  
        if (num2 == toplam)
        return true;  
        return false;
        }  
 
        public static void main(String args[]){  
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");  
        int number = input.nextInt();
        System.out.print("Amstrong is " + count(number));
      
        }
    }