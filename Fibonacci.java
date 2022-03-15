//fibonacci
import java.io.IOException;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de termos da sequência:");
        int n = sc.nextInt();

        int termo1 = 0;
        int termo2 = 1;
        int termo3 = 2;

        System.out.println(termo1 + "," + termo2);

        for (int i = 3; i <= n; i++) {
            termo3 = termo1 + termo2 + termo3;
            System.out.println("," + termo3);
            termo1 = termo2;
            termo2 = termo3;
        }
        sc.close();
    }
}