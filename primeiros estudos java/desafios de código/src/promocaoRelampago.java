/*
 * Na loja de departamentos "SuperCompras", o gerente decidiu fazer uma promoção especial. 
 * Dependendo do valor da compra, os clientes receberão diferentes descontos. 
 * Sua missão é implementar um programa que determine o desconto aplicado com base no valor gasto!
 * A entrada deve receber uma string representando o valor da compra em reais, utilizando duas 
 * casas decimais. O valor será sempre positivo e não conterá caracteres especiais.
 * Deverá retornar uma string informando o desconto aplicado. As regras são: se o valor for menor 
 * que 50, o desconto é de 0%. Se estiver entre 50 e 100, o desconto é de 10%. Acima de 100, o 
 * desconto é de 20%.
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class promocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        if (valor.compareTo(new BigDecimal("50"))<0){
          descontoPercentual = new BigDecimal("0.00");
        } else if (valor.compareTo(new BigDecimal("100"))<=0){
                descontoPercentual = new BigDecimal("10");
              } else 
                descontoPercentual = new BigDecimal("20");
                
        return String.format("Desconto de %.0f%%", descontoPercentual);
        
    }
}