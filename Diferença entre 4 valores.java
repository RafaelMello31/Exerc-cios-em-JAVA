import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
    System.out.println("Calculo da diferença entre 4 valores");
    
    System.out.println("Valor A: ");
    int a = scanner.nextInt();
    
    System.out.println("Valor B: ");
    int b = scanner.nextInt();
    
    System.out.println("Valor C: ");
    int c = scanner.nextInt();
    
    System.out.println("Valor D: ");
    int d = scanner.nextInt();
    
    int diferenca = (a*b) - (c*d);

	System.out.println ("Diferença: " + diferenca);
	
	}
}
