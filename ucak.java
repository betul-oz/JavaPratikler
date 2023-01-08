import java.util.Scanner;

public class ucak {
    
    public static void main(String[]args){
        double km;
        int yas, yon;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz:");
        km = input.nextDouble();
        System.out.println("Yaşınızı Griniz:");
        yas = input.nextInt();
        System.out.println("Yolculuğunuz tipiniz nedir? (1 veya 2 giriniz.)");
        yon = input.nextInt();

        double indirimsiz;
        indirimsiz = km*0.10;

        double indirimYas;
        indirimYas = (yas<12) ? 0.5 : (yas >= 12 && yas <= 24) ? 0.1 : (yas > 65) ? 0.3 : 0;
        System.out.println(indirimYas);
        System.out.println(indirimsiz * indirimYas);

        double indirimTip;
        indirimTip = (yon == 2)? 0.2 : 1;
        if (yon ==2 ){
            indirimsiz*=2; // indirimsiz = indirimsiz*2;
        } else{}

        System.out.println(indirimTip);
        System.out.println(indirimsiz * indirimTip);
        if ((km > 0 && yas > 0) && (yon == 1 || yon == 2)) {
            double bilet;
            bilet = indirimsiz - (indirimsiz * indirimYas) - (indirimsiz * indirimTip);
            System.out.println("Toplam Tutar= " + bilet);
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}