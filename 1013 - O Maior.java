import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	
	    Scanner scanner = new Scanner(System.in);
	    
	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    int c = scanner.nextInt();
	    
	    scanner.close();
	    
	    int maior = (a + b + Math.abs(a-b)) / 2;
	    int maior2 = (maior + c + Math.abs(maior - c)) / 2;
	    
	    System.out.println ("" + maior2 +  " eh o maior");
	
	}
}
