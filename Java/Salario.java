import java.util.Locale;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int fnum = input.nextInt(); //numero funcionario
        int hrtrab = input.nextInt(); // horas trabalhadas
        double recebhr = input.nextDouble();  //Valor da hora
        double sal = hrtrab * recebhr;

        System.out.println("NUMBER = " + fnum);
        System.out.printf("SALARY = U$ %.2f%n", sal);

        input.close();
    }
}
