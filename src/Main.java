import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,userName1="patika",password1="java123",select;


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adiniz : " );
        userName=inp.nextLine();

        System.out.print("Sifreniz : ");
        password=inp.nextLine();

        if (userName1.equals(userName) && password1.equals(password)){
            System.out.println("Giris yaptiniz.");
        } else if(userName1.equals(userName) && !password1.equals(password)) {
            System.out.println("Sifrenizi hatali girdiniz.\nSifrenizi yeniden olusturmak istermisiniz ?" +
                    "\nOlusturmak icin : e tusuna basiniz." +
                    "\nProgramdan cikmak icin : h tusuna basiniz");
            select = inp.nextLine();


                  if (select.equals("e")||select.equals("E")) {
                      System.out.print("Yeni sifrenizi olusturunuz : ");
                      password = inp.nextLine();

                      if (password1.equals(password)) {
                          System.out.print("Sifre olusturulamadi, lutfen yeniden giriniz : ");
                          password = inp.nextLine();
                          System.out.println("Sifre basariyla olusturuldu.");

                      }else {
                          System.out.println("Sifre olusturulamadi tekrar deneyiniz.");
                      }


                  }else {
                      System.out.println("Programdan cikiliyor.");
                  }
        }else {
            System.out.println("Giris yapamadiniz.");
        }

    }
}
