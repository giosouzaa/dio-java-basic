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

using System;

public class Desafio
{
        public static void Main ()
        {
            float valorSalario = float.Parse(Console.ReadLine());
            float valorBeneficios = float.Parse(Console.ReadLine());

            float valorImposto;

            if (valorSalario >= 0 && valorSalario <=1100)
            {
                valorImposto = 0.05F*valorSalario;
            } else if (valorSalario>1100 && valorSalario<=2500)
                {
                    valorImposto = 0.1F*valorSalario;
                }
                else if (valorSalario>2500)
                    {
                     valorImposto = 0.15F*valorSalario;   
                    }
            
            float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
        }
}