import java.util.Scanner;

public class atm {
   public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int balance = 10000;
System.out.println("Bakiyeniz : " + balance);
System.out.println("Yapmak istediğiniz işlemi seçiniz");
char button = input.next().charAt(0);



switch (button){
case '+' :
System.out.println("Yatırmak istediğiniz miktarı giriniz.");
int adding = input.nextInt();
balance = adding + balance;
System.out.println(balance);
break;

case '-' :
System.out.println("Çekmek istediğiniz miktarı giriniz.");
int decrease = input.nextInt();
if (decrease > balance){
System.out.println("Bakiyeniz yetersiz");
break;
}
else {balance = balance - decrease;
System.out.println(balance);
break;}

}




    } 
}
