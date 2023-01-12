import java.util.Scanner;
public class Questao4{
    public static void main(String args[]) {
      Scanner teclado = new Scanner(System.in);
      double valorHora, qtdHoras, percentual;
      double salarioBruto, salarioLiquido;
      System.out.println("Digite o valor da hora trabalhada:");
      valorHora = teclado.nextDouble();
      System.out.println("Digite a quantidade de horas trabalhada:");
      qtdHoras = teclado.nextDouble();
      System.out.println("Digite o percentual de desconto:");
      percentual = teclado.nextDouble();
      salarioBruto = valorHora*qtdHoras;
      salarioLiquido = salarioBruto-salarioBruto*percentual/100;
        System.out.println("O salario liquido eh:\n"+salarioLiquido);
    }
}