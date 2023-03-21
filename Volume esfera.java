import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
        System.out.println("Calculo de volume da esfera");
        
        System.out.println("Insira o valor do raio da esfera: ");
        float r = scanner.nextFloat();
        
        float pi = 3.14159f;
        
        float v = 4.0f/3 * pi * (r*r*r);
        
        System.out.printf("VOLUME = %.3f ", v);
        
	}
}
