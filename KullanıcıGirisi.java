import java.util.Scanner;

public class KullanıcıGirisi {

    public static void main(String[] args) {

        String userName,password,newPassword;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName=input.nextLine();
        System.out.print("Şifre: ");
        password=input.nextLine();

        if (userName.equals("betulozkan") && password.equals("pati123"))
            {
            System.out.println("Başarılı Giriş.");
            }
        else
            {
                System.out.println("Hatalı Kullanıcı Adı veya Şifre!");
                System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

                String cevap = input.nextLine();
                if (cevap.equals("evet")) {
                    System.out.print("Yeni şifreyi giriniz: ");
                    newPassword = input.nextLine();
    
                    if (newPassword.equals("java101")) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        System.out.print("Yeni şifreniz:" + newPassword);
                    }
                }
            }
        }
    }