import java.util.Locale;
import java.util.Scanner;

public class Omaior {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorab = (a+b+Math.abs(a-b)) / 2;

        if (maiorab > c) {
            System.out.println(maiorab + " eh o maior");
        } else{
            System.out.println(c + " eh o maior");
        }

        input.close();
    }
}
