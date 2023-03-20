import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Entre com os dados do usuário: ");
	
	System.out.println("Nome: ");
	String nome = scanner.nextLine();
	
	System.out.println("Id: ");
	String id = scanner.nextLine();
	
	System.out.println("Valor que recebe por hora trabalhada: ");
	double vt = scanner.nextDouble();
	
	System.out.println("Quantidade de horas trabalhadas: ");
	double ht = scanner.nextDouble();
	
	double salario = ht * vt;
	
	System.out.println("Nome: " + nome + "\nId func.: " + id + "\nSalario: " + salario);

	}
}
