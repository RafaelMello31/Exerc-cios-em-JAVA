import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("Calculando produto de dois valores ");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Valor de a: ");
		int a = scanner.nextInt();
		System.out.println("Valor de b:");
		int b = scanner.nextInt();
		int x = a*b;
		System.out.println("A * B = " + x);
		
			}
}
