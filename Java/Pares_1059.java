import java.util.Locale;
import java.util.Scanner;

public class Pares_1059 {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        for (int i = 0; i <= 100; i++) {

            if (i%2 ==0) {
                System.out.println();
                System.out.printf("\n" + i);
            }
            
        }

        Input.close();
    }
}

