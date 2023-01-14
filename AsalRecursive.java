import java.util.Scanner;

public class AsalRecursive {


    public static boolean volue(int a) {
        if (a<=1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
	        if (a % i == 0) {
	            return false;
	        }
	    }
	    return true;

    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
		System.out.print("Sayı değeri giriniz: ");
		int a = input.nextInt();
        boolean result = volue(a);

        if (result == true) {
           System.out.println(a+" sayısı asaldır.");
        } else {
            System.out.println(a+" sayısı asal değildir.");
        }
    }
    

}
