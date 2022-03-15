import java.util.Scanner;

class Troca {
  public void TrocaValores() {
    System.out.println("Informe o valor da variável de A e B");
    //criando variáveis
    Scanner sc = new Scanner(System.in);
    double A, B, C;
    System.out.println("A: ");
    A = sc.nextDouble();
    System.out.println("B: ");
    B = sc.nextDouble();

    C = A; 
    A = B;
    B = C;
   

    System.out.println();
    System.out.println("O novo valor de A: " + A);
    System.out.println("O novo valor de B: " + B);


    


    



    //
  }
}