import java.util.Locale;
import java.util.Scanner;

//Exemplo de switch case

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira a sigla de tamanho: ");
        String sigla = scanner.next();

        switch (sigla) {
            case "P":{
                System.out.println("Tamanho Pequeno");
                break;
            }
            case "M":{
                System.out.println("Tamanho Médio");
                break;
            }
            case ("G"):{
                System.out.println("Tamanho Grande");
                break;
            }
            
            default: System.out.println("Tamanho Indefinido");
                break;
        }
    }
}
