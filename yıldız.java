import java.util.Scanner;

public class yıldız {
    public static void main(String[] args){

    String yildiz = "*";
    Scanner input = new Scanner(System.in);
    int yildizSayisi = input.nextInt();
    for (int i = 0; i<yildizSayisi; i++) {
        for(int j= 0; j<=i;j++){
            System.out.print(yildiz);
        }
        System.out.print("\n");
    }
    }
}
