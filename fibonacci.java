import java.util.Scanner;

public class fibonacci {

    static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Kaçıncı sıradaki fibonacci sayısını istiyorsunuz: ");
        number = input.nextInt();
        System.out.println(number + ".Fibonacci Sayısı: " + fibo(number));
    }
}