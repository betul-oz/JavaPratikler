import java.util.Scanner;



public class maxmin {
    
    public static int max(int[] array){
        
        int max =0;
        for (int k= 0; k < array.length; k++) {
            if (array[k]>max){

                max = array[k];
            }

        }

        return max;
    }

    public static int min(int[]array){

        int min=array[0];
        for (int j=0; j < array.length; j++){
            if (array[j]< min && array[j] != 0){

                min = array[j];

            }
        }


        return min;
    }
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] newList = {12, 24, 40, 65, 22, 34, 87, 5};
    int[] arr2 = new int[10];
    int[] arr1 = new int[10];
    
    System.out.println("Hesaplamak istediğiniz sayıyı giriniz:");
    int sayı = input.nextInt();
    
    for (int i=0; i < newList.length ; i++ ){
       

       if(sayı < newList[i]){
        //sayı newlish arrayinin elemenlarından küçükse array1 e ekle
        arr1. = newList[i];
       }else{
        //sayı newlish arrayinin elemenlarından büyükse array2 e ekle
        arr2[i] = newList[i];
       }
       
    }

    for(int i =0; i< arr1.length; i++){
        System.out.println(arr1[i]);
    }

    



    System.out.println("Girilen sayıdan büyük en yakın sayı :" + max(arr2));
    System.out.println("Girilen sayıdan küçük en yakın sayı :" + min(arr1));
    }
}
