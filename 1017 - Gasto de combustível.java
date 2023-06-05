import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	    Scanner scanner = new Scanner(System.in);
	    
	        int t = scanner.nextInt();
	        int v = scanner.nextInt();
	       
	        float dp = t*v;
	        
	        float cn = dp/12;
	        
	        System.out.printf("%.3f\n", cn);
	    
	        scanner.close();
	}
}
