import java.util.Scanner;

public class ikiVeDordeBolunebilenSayilarinToplami {

    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner imp = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            n = imp.nextInt();
            if (n % 2 == 0 || n % 4 == 0){
                total = total + n;
            }else{
                System.out.println("Tek Sayı Girdiniz Tekrar Deneyin");
                break;
            }
        }while (n > 0);

        System.out.println("Sayıların Toplamı : " + total);


    }
}
