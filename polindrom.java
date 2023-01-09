import java.util.Scanner;

public class polindrom {
  
    static boolean polin(int number){
        int num = number, num2=0, num3;

        while (num != 0) {

            num3 = num % 10;
            num2 = (num2 * 10) + num3;
            num /= 10;
        }

        if (number == num2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Sayi giriniz: ");
            number = input.nextInt();

            if (polin(number) == true)
                System.out.println("Sayi palindromdur.");
            else
                System.out.println("Sayi palindrom değildir.");
        } while (number >= 0);      
 }
}