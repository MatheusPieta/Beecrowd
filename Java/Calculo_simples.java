import java.util.Locale;
import java.util.Scanner;

public class Calculo_simples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); //codigo de uma peça
        int b = input.nextInt(); //numero de peças
        double c = input.nextDouble(); // valor unitario de cada peça

        int a2 = input.nextInt(); //codigo de uma peça
        int b2 = input.nextInt(); //numero de peças
        double c2 = input.nextDouble(); // valor unitario de cada peça

        double total = b * c + b2 * c2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        input.close();
    }
}
