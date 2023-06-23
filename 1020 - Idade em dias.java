import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		int ano=0, mes=0, dia=0;
		
		for (int i=0; i<x; i++) {
		   
		   dia++;
		 
		    if(dia==30) { 
		       
		       mes++; 
		       dia=0;
		      
		    }
		    
		       if(mes==12){
		           
		           ano++;
		           mes=0;
		           dia = -5;
		           
		    }
		}
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
	}
}
