import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextFloat();
        double y1 = scanner.nextFloat();
        double x2 = scanner.nextFloat();
        double y2 = scanner.nextFloat();
        
        scanner.close();
        
        double distancia = Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
        
        System.out.printf("%.4f\n", distancia);
        
        
	}
}
