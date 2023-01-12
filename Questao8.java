import java.util.Scanner;
public class Questao8{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int hora, minuto, tempoEmMinutos;
        
        System.out.println("Digite a quantidade de horas");
        hora = teclado.nextInt();
        System.out.println("Digite a quantidade de minutos");
        minuto = teclado.nextInt();
        tempoEmMinutos = hora*60+minuto;
        
        System.out.println("Desde o inicio do dia se passaram\n"+tempoEmMinutos+" minutos");
    }
}