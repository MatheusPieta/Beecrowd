import java.util.Scanner;

public class Produtosimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int prod = a*b;

        System.out.println("PROD = " + prod);

        input.close();
    }
}
