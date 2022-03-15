//Base
import java.io.IOException;
import java.util.Scanner;

public class Base {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro decimal:");
        int n = sc.nextInt();

        int q = n;
        int[] r = new int[100];
        int i = 0;

        while (q > 0) {
            r[i] = q % 2;
            i++;
            q = (int) Math.floor(q / 2);
        }

        System.out.println("Número " + n + " na base binária: ");

        String bin = "";

        while (i > 0) {
            i--;
            bin = bin + r[i];
        }

        System.out.println(bin);

        sc.close();
    }
}