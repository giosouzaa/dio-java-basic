/* 
Escreva um código onde o usuário insira um número e seja gerada sua 
tabuada de 1 a 10. 
*/
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numero = 0;
        int resultado = 0;
        System.out.println("Insira um número inteiro:");
        
        numero = scanner.nextInt();

        System.out.printf("Tabuada do número %s: \n" , numero);

        for (int i=1;i<=10;i++)
        {
            resultado = numero*i;
            System.out.printf("%s x %s = %s \n", numero, i, resultado);
        }

    }
}
