import java.util.Scanner;

public class ust {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Sınır Sayısını Girini:");
    int k ;
    k = input.nextInt();

    for (int i = 1; i <= k; i *= 4){
        System.out.println(i);
    }
    for (int j = 1; j <= k; j *= 5){
        System.out.println(j);
    }
   }
}