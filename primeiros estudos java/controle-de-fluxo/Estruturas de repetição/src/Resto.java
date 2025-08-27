/*
 * Escreva um código onde o usuário informaum número inicial, posteriormente 
 * irá informar outros N números, a execução do código irá continuar até que 
 * o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão. 
 * Números menores que o primeiro número devem ser ignorados.
 */
import java.util.Scanner;
public class Resto {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro inicial:");
        var numero1 = scanner.nextInt();
        var numero2 = 0;
        var resto = 0;

        do{
            System.out.printf("Insira um número inteiro maior que %s:\n", numero1);
            numero2 = scanner.nextInt(); 

            if(numero2>numero1 && numero2%numero1!=0){
                System.out.printf("O resto de %d dividido por %d é diferente de zero.\n", numero2, numero1);
                resto = numero2 % numero1;
            }
            
        }while (resto==0);
            
    }
}
