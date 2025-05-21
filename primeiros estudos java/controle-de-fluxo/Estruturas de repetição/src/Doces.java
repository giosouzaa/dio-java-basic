import java.util.concurrent.ThreadLocalRandom;

//Exemplo While
//Joãozinho recebeu R$50 de mesada e foi a uma loja comprar doces enquanto ainda tivesse dinheiro

public class Doces {
    public static void main(String[] args) {
        double mesada = 50;
        while(mesada>0){
            double doce = valorAleatorio();

            if(doce>mesada){
                //doce = mesada; //para comprar um doce que caiba no valor restante
                break; //para encerrar as compras caso não haja mais doces que caibam no valor restante
            }
            String doceFormatado = String.format("%.2f", doce); //formata a variável para exibição de apenas dois algorismos após a vírgula
            System.out.println("Doce de R$" + doceFormatado + " adicionado ao carrinho.");
            mesada = mesada - doce;
        }
        String mesadaFormatada = String.format("%.2f", mesada); 
        System.out.println("Valor restante: R$" + mesadaFormatada); 
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0.5,9.99);
    }
}
