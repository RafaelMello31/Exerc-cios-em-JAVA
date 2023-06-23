import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int seg=0, min=0, hr=0;
		
		for (int i = 0; i<x; i++) {
		    
		    seg++;
		    
		    if (seg==60) {
		        
		        seg=0;
		        min++;
		        
		        if(min==60){
		            
		            min=0;
		            hr++;
		        }
		    }
		}
		
		System.out.printf("%d:%d:%d\n",hr, min, seg);
	}
}
