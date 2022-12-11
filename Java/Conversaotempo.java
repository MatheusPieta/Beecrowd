import java.util.Locale;
import java.util.Scanner;

public class Conversaotempo {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int segundos = input.nextInt();

        int minutos = segundos/60;
        int horas = minutos/60;

        System.out.println(horas + ":" + (minutos%60) + ":" + (segundos%60));

        input.close();
    }
}
