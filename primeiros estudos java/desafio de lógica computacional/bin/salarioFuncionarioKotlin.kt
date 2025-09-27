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

object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario >= 0 && salario <=1100) -> 0.05
            (salario >1100 && salario <=2500) -> 0.1
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main () {
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficios = readLine()!!.toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSaario);
    val saida = valSalario - valorImposto + valorBeneficios;

    println(String.format("%.2f", saida));
}