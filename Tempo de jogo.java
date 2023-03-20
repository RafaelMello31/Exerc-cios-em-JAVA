import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tempo de jogo com minutos: ");
		int hi,mi,hf,mf;
		
		do {
		System.out.println("Informe a hora inicial do jogo: ");
		hi = scanner.nextInt();
		
		if(hi>=24) {
		    System.out.println("Hora inválida, favor inserir um valor entre 0 e 23");
		}
		} while (hi >= 24);
		
		do {
		System.out.println("Informe o minuto inicial do jogo: ");
		mi = scanner.nextInt();
		
		if(mi>=60){
		    System.out.println("Minuto inválido, favor inserir um valor entre 0 e 59");
		}
		} while (mi >= 60);
		
		do{
		System.out.println("Informe a hora de encerramento do jogo: ");
		hf = scanner.nextInt();
		
		if(hf>=24){
		    System.out.println("Hora inválida, favor inserir um valor entre 0 e 23");
		}
		} while (hf >=24);
		
		do{
		System.out.println("Informe o minuto de encerramento do jogo: ");
        mf = scanner.nextInt();
        
        if(mf>=60){
            System.out.println("Minuto inválido, favor inserir um valor entre 0 e 59");
        }
        } while (mf >=60);
		
		int hj = hf - hi;
		int mj = mf - mi;
		
		if(hj<=0) {
		    
		    hj = 24;
		    
		}
		
		if (mj<0) {
		    
		    hj--;
		    mj += 60;
		}
		    
	System.out.println("O jogo durou " + hj + " horas e " + mj + " minutos");
	
	}
		
		
		
		
}
