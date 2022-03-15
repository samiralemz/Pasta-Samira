//Seno
import java.io.IOException;
import java.util.Scanner;

public class Seno {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de x:");
        int x = sc.nextInt();

        System.out.println("Informe o número de termos da série:");
        int n = sc.nextInt();

        double termo;
        double sinal = 1;
        int j = 1;
        double seno = 0;

        for (int i = 1; i <= n; i++) {
            termo = Math.pow(x, j) / fatorial(j);
            seno = seno + sinal * termo;
            sinal = -1 * sinal;
            j = j + 2;
        }

        System.out.println(String.format("%.2f", seno));

        sc.close();
    }

    private static int fatorial(int n) {
        int fat = 1;

        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }

        return fat;
    }
}