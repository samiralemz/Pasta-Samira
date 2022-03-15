//fatorial
import java.io.IOException;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        int fatorial = 1;
        int i = n;

        while (i >= 1) {
            fatorial = fatorial * 1;
            i = i - 1;
        }
        System.out.println("Ofatorial de " + n + " é " + fatorial);
        sc.close();
    }
}