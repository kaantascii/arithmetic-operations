import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan 3 değer alır.
        System.out.println("1.sayıyı giriniz");
        int a = scanner.nextInt();

        System.out.println("2.sayıyı giriniz");
        int b = scanner.nextInt();

        System.out.println("3.sayıyı giriniz");
        int c = scanner.nextInt();

        //işlem sonucunu basar.
        System.out.println("sonuc = " +( a + (b * c) - b) );


    }
}
