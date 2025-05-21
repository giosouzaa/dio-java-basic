import java.util.Locale;
import java.util.Scanner;

//Exemplo de fluxo com condição ternária


public class ResultadoEscolarOpTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira a nota final obtida: ");
        double nota = scanner.nextDouble();

        String resultado = nota>=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
