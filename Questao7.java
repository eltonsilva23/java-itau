import java.util.Scanner;
public class Questao7{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor de A:");
        a = teclado.nextInt();
        System.out.println("Digite o valor de B:");
        b = teclado.nextInt();
        System.out.println("\nOs valores digitados invertidos sao:");
        System.out.println("A = "+b);
        System.out.println("B = "+a);
    }
}