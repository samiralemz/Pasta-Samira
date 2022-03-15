//caractere
import java.io.IOException;
import java.util.Scanner;

public class Caractere {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma sequência de caracteres númerica:");
        String sequencia = sc.next();

        char caractere;
        int codigo;
        int numero = 0;
        int n = sequencia.length();

        for (int i = 0; i < n; i++) {
            caractere = sequencia.charAt(i);
            codigo = Character.valueOf(caractere);
            numero = numero * 10 + (codigo - 48);
        }

        System.out.println("O número decimal correspondente é: " + numero);

        sc.close();
    }
}