import java.util.Scanner;

public class hesapMakinesi {
    public static int toplama (int a,int b) {
        return a+b ;
    }
    public static int cikartma (int a , int b) {
        return a-b ;
    }
    public static int carpma (int a , int b) {
        return a*b ;
    }
    public static int bolme (int a , int b) {
        return a/b;
    }
    public static int usAlma (int a,int b) {
       return (int) Math.pow(a,b);
    }

    public static void main(String[] args) {
        System.out.println(" 1) Toplama \n 2) Çıkartma \n 3) Çarpma \n 4) Bölme \n 5) Üs Alma \n 6) Çıkış Yap \n Lütfen İşlem Seçiniz : ");
        Scanner veri = new Scanner(System.in);
        int islem = veri.nextInt();
        if (islem != 1 &&islem != 2 &&islem != 3 && islem != 4 &&islem !=  5 && islem != 6 ) {
            System.out.println("Yanlış bir işlem girdiniz. Program Kapatılıyor...");
        }
        else if (islem==1) {
            System.out.println("Lütfen ilk ve ikinci sayıyı giriniz :");
            int a = veri.nextInt();
            int b = veri.nextInt();
            System.out.println("Sonuç : " + toplama(a,b));
        } else if (islem==2) {
            System.out.println("Lütfen ilk ve ikinci sayıyı giriniz :");
            int a = veri.nextInt();
            int b = veri.nextInt();
            System.out.println("Sonuç : " + cikartma(a,b));
        } else if (islem == 3) {
            System.out.println("Lütfen ilk ve ikinci sayıyı giriniz :");
            int a = veri.nextInt();
            int b = veri.nextInt();
            System.out.println("Sonuç : " + carpma(a,b));
        } else if (islem==4) {
            System.out.println("Lütfen ilk ve ikinci sayıyı giriniz :");
            int a = veri.nextInt();
            int b = veri.nextInt();
            System.out.println("Sonuç : " + bolme(a, b));
        } else if (islem == 5) {
            System.out.println("Lütfen ilk ve ikinci sayıyı giriniz :");
            int a = veri.nextInt();
            int b = veri.nextInt();
            System.out.println("Sonuç : " + usAlma(a,b));
        }
        else if (islem == 6) {
                System.out.println("Hesap Makinesinden Başarıyla Çıkış Yapılmıştır.");
            }
        }
    }
