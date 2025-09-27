/*
 * Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
 * Para realizar o cálculo receba o valor do salário bruto e o adicional dos benefícios.
 * O salário a ser transferido é calculado da seguinte forma:
 * Salário a ser transferido = Salário bruto + Adicional do benefícios - Imposto mediante ao salário.
 * 
 * Para calcular o percentual de imposto segue as aliquotas:
 * De R$0,00 a R$1100,00 = 5,00%
 * De R$1100,01 a R$2500,00 = 10,00%
 * Acima de R$2500,00 = 15,00%
*/
import java.util.Scanner;

public class salarioFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o salário bruto:");
        float salario = scanner.nextFloat();
        System.out.println("Insira o adicional dos benefícios:");
        float adicionalBeneficios = scanner.nextFloat();

        double salarioTransferido = 0;

        if (salario>=0 && salario<1100) {
            salarioTransferido = salario - salario * 0.05 + adicionalBeneficios;
        } else if (salario>1100 && salario<2500){
                salarioTransferido = salario - salario * 0.1 + adicionalBeneficios;
            } else if (salario>=2500){
                   salarioTransferido = salario - salario * 0.15 + adicionalBeneficios; 
                }

        System.out.printf("O salário transferido será de R$%.2f para o salário bruto de R$%.2f com adicional de R$%.2f. \n\n", salarioTransferido, salario, adicionalBeneficios);
        scanner.close();
    }
}