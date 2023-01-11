import java.util.Scanner;

public class Leitura {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    int numero, r1, r2, r3;
    System.out.println("Digite um numero de tres algarismos:");
    numero = teclado.nextInt();
    r1 = numero % 10;
    r2 = numero / 10;
    r2 = r2 % 10;
    r3 = numero / 100;
    System.out.println("" + r1 + r2 + r3);
  }
}