// Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
// ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;

public class teksayı {
    public static void main(String[]args){
        int k;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz sayıyı giriniz:");
        k = input.nextInt();
        for (int i= 0; i<=k; i++){
            if (i % 2 == 0){
                //i çift sayıdır
            }else{                 
                System.out.println(result+=i);
            }
        }
         
        






    }
}
