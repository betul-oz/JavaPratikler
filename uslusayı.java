import java.util.Scanner;

public class uslusayı {
    public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    System.out.print("Taban Sayıyı Giriniz:");
    int n = input.nextInt();
    System.out.print("Üssü Giriniz:");
    int r = input.nextInt();

    int sonuc = 1;

    int i = 1;
    while (i <= r){
        sonuc *= n;
        i++;
       }

    System.out.print(sonuc);
    }
}
