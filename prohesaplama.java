import java.util.Scanner;

public class prohesaplama {

    static void toplam(int a, int b){
        int result = a + b;
        System.out.println(result);
    }

    static int cikartma(int a, int b){
        int result = a - b;
        if(a > b){
            System.out.println(result);
        }else{
            System.out.println(-result);
        }
        return result;
    }

     static void bölme(int a, int b){
        if (a > b){
            System.out.println(a / b);
        } else {
            System.out.println(b / a);
        }
     }

     static int carpma(int a, int b){
        int result = a * b; 
        System.out.println(result);
        return result;
     }

public static void main(String[]args){

    // toplam(10, 50);
    // cikartma(10,40);
    // bölme(20, 5);
    // carpma(2,14);
    Scanner input = new Scanner(System.in);
    System.out.print("işaret giriniz:");
    char sign = input.next().charAt(0);
    System.out.print("sayıları giriniz:");
    int num1 = input.nextInt();
    System.out.print("ikinci sayıyı giriniz:");
    int num2 = input.nextInt();

    switch (sign) {
        case '+' :
            toplam(num1, num2);
            break;

        case '-' :
          cikartma(num1, num2);
          break;

        case '/' :
          bölme(num1, num2);
          break;

        case '*' :
          carpma(num1, num2);
          break;  

        default:

        System.out.println("Geçersiz işlem! \nTekrar Deneyiniz.");
            break;
         }
    }
}