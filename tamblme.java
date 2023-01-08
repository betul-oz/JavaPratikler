
import java.util.Scanner;
public class tamblme {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz sayıyı giriniz:");
        int k;
        k = input.nextInt();
        int ortalama =0;
        int counter = 0;
        for (int i = 7; i<=k; i++){
            if (i % 3 == 0 && i % 2 == 0 ){
                System.out.println(i);

                counter++;
                ortalama = ortalama+i;
          
            }
        }
        System.out.println("ort:" + ortalama);
        int result=ortalama/counter;
        System.out.println("sonuc:" + result);
    }
}
