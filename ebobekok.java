import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1 , ekok = 1;

        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        /*
        for (int i = n1; i >= 1 ; i--){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println(ebob);
                break;
            }
        }
        */

        if (n1 < n2 ){
        int i = n1;
        while (i >= 1){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ebobu : " + ebob);
                ekok = (n1 * n2) / ebob;
                System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ekoku : " + ekok);
                break;
            }
            i--;
        }
        }else {
            int i = n2;
            while (i >= 1){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                    System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ebobu : " + ebob);
                    ekok = (n1 * n2) / ebob;
                    System.out.println(n1+"'in" + " ve " + n2+"'nin" + " ekoku : " + ekok);
                    break;
                }
                i--;
            }
        }



    }
}
