import java.util.Locale;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        
        System.out.println(a);
        System.out.println( a / 100 + " nota(s) de R$ 100,00");
        a = a % 100;
        System.out.println( a / 50 + " nota(s) de R$ 50,00");
        a = a % 50;
        System.out.println( a / 20 + " nota(s) de R$ 20,00");
        a = a % 20;
        System.out.println( a / 10 + " nota(s) de R$ 10,00");
        a = a % 10;
        System.out.println( a / 5 + " nota(s) de R$ 5,00");
        a = a % 5;
        System.out.println( a / 2 + " nota(s) de R$ 2,00");
        a = a % 2;
        System.out.println( a / 1 + " nota(s) de R$ 1,00");

        input.close();
    }
}
