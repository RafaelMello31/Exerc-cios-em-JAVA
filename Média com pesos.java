import java.util.Scanner;

public class Main {
    
    public static void main (String[]args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da nota N1: " );
        float n1 = scanner.nextFloat();
        
        System.out.println("Digite o valor da nota N2: ");
        float n2 = scanner.nextFloat();
        
        float np1 = n1 * 0.35f;
        float np2 = n2 * 0.75f;
        
        float media = np1 + np2;
        
           if (media>= 10) {
            media = 10;
        }
        
        System.out.println ("Média do aluno: " + media);
        
    }
}
