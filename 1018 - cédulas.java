import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] i = new int[7];
		int j=0;
		
		int x = scanner.nextInt();
		
		if (x>0) {
		    
		    i[0] = x/100; 
		    j = x % 100; 
		    
		}
		
		if (j>=50) {
		    
		     i[1] =  j/50; 
		     j =  j % 50; 
		    
		}
		
	
		if (j>=20) {
		    
		    i[2] =  j/20; 
		     j =  j % 20; 
		    
		}
	
	
	    if (j>=10) {
	        
	        i[3] =  j/10; 
	         j =  j % 10; 
	         
	    }
	    
	    if (j>=5) {
	        
	         i[4] =  j/5; 
	         j =  j % 5; 
	         
	    }
	    
	    if (j>=2) {
	        
	         i[5] =  j/2; 
	         j =  j % 2; 
	         
	     }
	     
	     if (j>=1) {
	         
	          i[6] =  j/1; 
	          
	      }

	scanner.close();
	
	   System.out.printf("%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",
	   x,i[0], i[1], i[2], i[3], i[4], i[5], i[6]);
	
	}
}

