//Inversao
import java.io.IOException;
import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo:");
        int number = sc.nextInt();

        int invertido = 0;
        int digito;
        int q = number;

        while (q > 0) {
            digito = q % 10;
            invertido = invertido * 10 + digito;
            q = (int) Math.floor(q / 10);
        }

        System.out.println("Número original: " + number);
        System.out.println("Número invertido: " + invertido);

        sc.close();
    }
}