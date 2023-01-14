import java.util.Scanner;

public class minmax {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Sayı Giriniz: ");
    int n = input.nextInt();

    int[] array = new int[n];
   
    for(int i=0; i<n; i++){
        System.out.print(i+1 + ". sayıyı giriniz:");
        int a = input.nextInt();
        array[i] = a;
    }

    // for(int i=0; i<n; i++){
    //     System.out.println(array[i] + " ");
       
    // }   
    int max=0;
    for(int i =0; i < array.length; i++){
        if (array[i]>max){
            max=array[i];
            System.out.println("En büyük sayı: " + max);
        }
    }

    int min=array[0];
    for (int j=0; j < array.length; j++){
        if (array[j]<min){
            min=array[j];
            System.out.println("En büyük sayı: " + min);

        }
    }









    }
}
