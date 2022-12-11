import java.util.Locale;
import java.util.Scanner;

public class Distancia {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int kmDist = input.nextInt();

        int calculo = kmDist * 2;

        System.out.println(calculo + " minutos");

        input.close();
    }
}