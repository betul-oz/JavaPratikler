import java.util.Scanner;

public class ortalama {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Ortalamalarını almak istediğiniz sayıları giriniz:"); 
    
    int[] number = new int[13];
    int sum= 0;

        for (int i=0; i<number.length; i++){
        number[i] = input.nextInt();
        sum += number[i];
        }
        
        int avarage = sum/number.length;
        System.out.println(avarage);  
    }
}