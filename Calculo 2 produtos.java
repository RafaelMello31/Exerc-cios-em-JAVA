import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo peças");
		
		System.out.println("Código do produto 1: ");
		String cod1 = scanner.nextLine(); 
		
		System.out.println("Quantidade do produto 1: ");
		int q1 = scanner.nextInt();
		
		System.out.println("Preço do produto 1: ");
		double p1 = scanner.nextDouble();
		
		System.out.println("Código do produto 2: ");
		String cod2 = scanner.nextLine();
		
		System.out.println("Quantidade do produto 2: ");
		int q2 = scanner.nextInt();
		
		System.out.println("Preço do produto 2: ");
		double p2 = scanner.nextDouble();
		
		double pagar = (q1 * p1) + (q2 * p2);
		
		System.out.println("Valor a pagar: R$ " + pagar);
		
		
	}
}
