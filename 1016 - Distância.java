import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int tempo = a*2;
		
		System.out.println("" + tempo + " minutos");
		
		scanner.close();
		
	}
}
