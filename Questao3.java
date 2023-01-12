import java.util.Scanner;
public class Questao3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double salarioMinimo, quantidadeKw;
        double cadaKw, valorNormal, valorComDesconto;
        
        System.out.println("Digite o valor do salario Minimo:");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Digite a quantidade consumida (em Kw):");
        quantidadeKw = teclado.nextDouble();
        
        cadaKw = (salarioMinimo/7)/100;
        System.out.println("\na. o valor em reais de cada kw.\n"+cadaKw);
        
        valorNormal = cadaKw*quantidadeKw;
        System.out.println("\nb. o valor em reais a ser pago\n"+valorNormal);
        
        valorComDesconto = valorNormal - (valorNormal*10/100);
        System.out.println("\nc. o novo valor a ser pago por essa residência com um desconto de 10%\n"+valorComDesconto);
        
    }
}