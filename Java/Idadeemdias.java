import java.util.Locale;
import java.util.Scanner;

public class Idadeemdias {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int ano, meses, dia;
        int idade_dias = input.nextInt();

        ano = idade_dias / 365;
        idade_dias = idade_dias % 365;

        meses = idade_dias / 30;
        idade_dias = idade_dias % 30;

        dia = idade_dias;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dia + " dia(s)");

        input.close();

    }
}


