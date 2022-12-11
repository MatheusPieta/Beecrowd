import java.util.Locale;
import java.util.Scanner;

public class Salario_bonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String fnome = input.nextLine(); //nome funcionario
        double salario = input.nextDouble(); // salario
        double vendas = input.nextDouble();  //Valor da hora
        double totalreceb = (vendas * 0.15) + salario;

        System.out.printf("TOTAL = R$ %.2f%n", totalreceb);

        input.close();
    }
}
