/*
 * Escreva um código em que o usuário entre com um primeiro número, 
 * um segundo número maior que o primeiro e escolha entre a opção par ou ímpar, 
 * com isso o código deve informar todos os número pares ou ímpares 
 * (de acordo com a seleção inicial) no intervalo de números informados, 
 * incluindo os números informados e em ordem decrescente.
 */
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int escolha;

        System.out.println("Insira um número inteiro:");
        numero1 = scanner.nextInt();
        System.out.println("Insira um número inteiro maior que o anterior:");
        numero2 = scanner.nextInt();

        System.out.println("Insira o número 1 para optar por imprimir números pares ou 2 para imprimir números ímpares:");
        escolha = scanner.nextInt();

        if(escolha==1){
            for(int i=numero2;i>=numero1;i--){
                if(i%2==0)
                System.out.println(i);
            }
        } else if (escolha ==2){
                for(int i=numero2;i>=numero1;i--){
                    if(i%2!=0)
                    System.out.println(i);
                }
            } else System.out.println("Opção inválida.");

    }
}
