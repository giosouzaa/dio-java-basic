import java.util.Locale;
import java.util.Scanner;

//Exemplo do fluxo condicional

public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        System.out.println("Saldo disponível para saque: R$" + (saldo));

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o valor para saque:");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado <= saldo){ //Controle de fluxo simples (uma única saída)
            saldo = saldo - valorSolicitado;
        }else //Controle de fluxo composto (mais de uma saída)
            System.out.print("Erro: valor solicitado acima do permitido. ");
        
        System.out.println("Saldo disponível para saque: R$" + (saldo));
        
    }
}
