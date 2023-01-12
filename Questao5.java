import java.util.Scanner;
public class Questao5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double tempo, velocidade, distancia, litros;
        System.out.println("Digite o tempo (em horas):");
        tempo = teclado.nextDouble();
        System.out.println("Digite a velocidade (em km/h):");
        velocidade = teclado.nextDouble();
        distancia = tempo*velocidade;
        litros = distancia/12;
        System.out.println("Quantidade de Litros gastos:\n"+litros+" litros");
    }
}