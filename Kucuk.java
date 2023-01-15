import java.util.Scanner;
import java.util.Arrays;

public class Kucuk {
    
      public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Döngünüzün kaç elemanlı olduğunu giriniz:");
        int n = input.nextInt();
        int[] array = new int[n]; 

        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( "Döngünün" + (i + 1) + ". elemanı giriniz: ");
            int element = input.nextInt();
            array[i] = element;
        }

        Arrays.sort(array);

        System.out.println("\nSorted array:");
        for (int i: array) {
            System.out.print(i + " ");
        }
    }
}
