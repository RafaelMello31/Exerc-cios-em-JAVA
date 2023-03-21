import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	  
	    System.out.println("Entre com o valor de A: ");
	    double a = scanner.nextDouble();
	    
	    System.out.println("Entre com o valor de B: ");
	    double b = scanner.nextDouble();
	    
	    System.out.println("Entre com o valor de C: ");
	    double c = scanner.nextDouble();
	    
	    double pi = 3.14159;
	    
	    double tr = (a*c)/2;
	    double circ = pi * (c*c);
	    double trap = ((a + b) *c)/2;
	    double quad = b*b;
	    double ret = a * b;
	    
	    System.out.printf("Triangulo = %.3f ", tr);
	    System.out.printf("Circulo = %.3f", circ);
	    System.out.printf("Trapezio = %.3f", trap);
	    System.out.printf("Quadrado = %.3f ", quad);
	    System.out.printf("Retangulo = %.3f ", ret);
	    
	}	    
}
