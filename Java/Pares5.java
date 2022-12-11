import java.util.Locale;
import java.util.Scanner;

public class Pares5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int possivelpar;
        int contador = 5;
        int quantidadepar = 0;

        while (contador>0) {

            possivelpar = input.nextInt();
            contador = contador - 1;

            if (possivelpar%2==0) {
                quantidadepar = quantidadepar + 1;

            }
            
        }

        System.out.println(quantidadepar + " valores pares");
        input.close();
    }
}
