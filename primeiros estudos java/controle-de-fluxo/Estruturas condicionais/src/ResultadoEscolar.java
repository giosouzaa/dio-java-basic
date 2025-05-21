import java.util.Locale;
import java.util.Scanner;

//Exemplo de fluxo condicional encadeado

public class ResultadoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira a nota final obtida: ");
        double nota = scanner.nextDouble();

        if(nota>=7){
            System.out.println("Aprovado");
        }else 
            if(nota>=5 && nota<7){
                System.out.println("Recuperação");
            }else
                System.out.print("Reprovado");

    }
}
