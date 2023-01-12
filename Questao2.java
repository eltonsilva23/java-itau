import java.util.Scanner;
public class Questao2 {
  public static void main(String args[]) {
    
    Scanner teclado = new Scanner(System.in);
    double base, altura, diagonal1, diagonal2, area;
    double baseMaior, baseMenor, profundidade, raio, volume;
    
    System.out.println("Digite o lado do quadrado:");
    base = teclado.nextInt();
    area = base*base;
    System.out.println("\na. Area do Quadrado:\n" + area);
    
    System.out.println("Digite a base do retangulo:");
    base = teclado.nextInt();
    System.out.println("Digite a altura do retangulo:");
    altura = teclado.nextInt();
    area = base*altura;
    System.out.println("\nb. Area do Retangulo:\n" + area);
    
    System.out.println("Digite a base do triangulo:");
    base = teclado.nextInt();
    System.out.println("Digite a altura do triangulo:");
    altura = teclado.nextInt();
    area = (base*altura)/2;
    System.out.println("\nc. Area do Triangulo:\n" + area);
    
    System.out.println("Digite a diagonal 1 do losango:");
    diagonal1 = teclado.nextInt();
    System.out.println("Digite a diagonal 2 do losango:");
    diagonal2 = teclado.nextInt();
    area = (diagonal1*diagonal2)/2;
    System.out.println("\nd. Area do Losango:\n" + area);
    
    System.out.println("Digite a base maior do trapézio:");
    baseMaior = teclado.nextInt();
    System.out.println("Digite a base menor do trapézio:");
    baseMenor = teclado.nextInt();
    System.out.println("Digite a altura do trapézio:");
    altura = teclado.nextInt();
    area = (baseMaior+baseMenor)*h/2;
    System.out.println("\ne. Area do Losango:\n" + area);
    
    System.out.println("Digite a base altura do paralelepipado:");
    base = teclado.nextInt();
    System.out.println("Digite a largura menor do paralelepipado:");
    altura = teclado.nextInt();
    System.out.println("Digite a profundidade do paralelepipado:");
    profundidade = teclado.nextInt();
    volume = base+altura*profundidade;
    System.out.println("\nf. O volume do paralelepipado:\n" + volume);
    
    System.out.println("Digite o lado do cubo:");
    base = teclado.nextInt();
    volume = base*base*base;
    System.out.println("\ng. O volume do Cubo:\n" + volume);
    
    System.out.println("Digite o diametro 1 do circulo:");
    raio = teclado.nextInt();
    raio = raio/2;
    System.out.println("Digite a altura do cilindro:");
    altura = teclado.nextInt();
    volume = 3,14*raio*raio*altura;
    System.out.println("\nh. O volume do Cilindro:\n" + volume);
  }
}