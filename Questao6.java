import java.util.Scanner;
public class Questao6{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double valorInicial, taxaJuros, qtdMeses, valorPrestacao;
        
        System.out.println("Digite o valor inicial:");
        valorInicial = teclado.nextDouble();
        System.out.println("Digite a taxa de Juros");
        taxaJuros = teclado.nextDouble();
        System.out.println("Digite a quantidade de meses");
        qtdMeses = teclado.nextDouble();
        
        valorPrestacao = valorInicial*(1+taxaJuros/100)*qtdMeses;
        
        System.out.println("O valor atual da prestacao é de R$ "+valorPrestacao);
    }
}