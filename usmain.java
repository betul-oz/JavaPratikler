import java.util.Scanner;

public class usmain {
    
    public static int hesap(int ust, int taban){
        int sonuc = 1;
        for (int i=1; i <= ust; i++){
            sonuc *= taban;   
        }
         return sonuc;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz:");
        int taban = input.nextInt();
        System.out.print("Üss sayısını giriniz:");
        int ust = input.nextInt();
        int sonuc = hesap( ust, taban);
        
        System.out.print("İşlem sonucu:" + sonuc);

    }
}
