import java.util.Scanner;
public class hesapmak {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    char sign = input.next().charAt(0);

    boolean a = false;
    
    // System.out.println(num1);
    // System.out.println(num2);
    // System.out.println(sign);
    switch (sign){
        case '+' :
        System.out.println(num1 + num2);
        
        break;
        case '-':
        if(num1 >= num2){
        System.out.print(num1 - num2);
        }
        else{
        System.out.print(num2 - num1);
        }
        break;
        case '*' :
        System.out.println(num1 * num2);
        break;
        default : 
        System.out.println("There were no result");}
    } 
}
}
