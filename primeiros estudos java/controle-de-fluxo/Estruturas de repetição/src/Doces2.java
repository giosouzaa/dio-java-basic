//Exemplo do controle de fluxo DoWhile

//Joãozinho resolveu ligar para o seu amigo para dizer que hoje se entupiu de comer docinhos
import java.util.Random;

public class Doces2 {
    public static void main(String[] args) {
        
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando...");
        } while(tocando());

        System.out.println("Alô?");

    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
