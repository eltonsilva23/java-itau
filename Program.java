import java.util.Scanner;
public class Program {
    public static void main(String args[]) {
      Scanner teclado = new Scanner(System.in);
      double n1, n2, media;
      System.out.println("Digite a primeira nota:");
      n1 = teclado.nextDouble();
      System.out.println("Digite a segunda nota:");
      n2 = teclado.nextDouble();
      media = (n1+n2)/2;
      System.out.println("A sua media eh:\n"+media);
    }
}