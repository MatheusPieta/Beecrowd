import java.util.Locale;
import java.util.Scanner;

public class Gastocombustivel {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempogasto = input.nextInt();
        int velocidademedia = input.nextInt();

        double consumo = (tempogasto * velocidademedia) / 12.0;

        System.out.printf("%.3f", consumo);

        input.close();
    }
}
