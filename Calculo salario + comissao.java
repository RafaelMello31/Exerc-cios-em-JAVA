import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com os dados do vendedor: ");
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Salário fixo: ");
		double fixo = scanner.nextDouble();
		
		System.out.println("Vendas no mês: "); 
		double comissao = scanner.nextDouble();
		
		double salario = fixo + (comissao * 0.15);
		
		System.out.println("Nome: " + nome +  "\nSalário: " + salario);
		
	}
}
