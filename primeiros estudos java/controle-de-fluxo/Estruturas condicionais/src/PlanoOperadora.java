import java.util.Locale;
import java.util.Scanner;

//Exemplo de switch case aproveitando a funcionalidade do break

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira a sigla do plano: ");
        String sigla = scanner.next();

        switch (sigla) {
            case "T":{
                System.out.println("5Gb de Youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram ilimitados");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
                break;
            }
            default: System.out.println("Plano Indefinido");
                break;
        }
    }
}