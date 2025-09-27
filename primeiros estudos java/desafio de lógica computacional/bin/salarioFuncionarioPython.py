# Faça um programa que calcule e imprima o salário a ser transferido para um funcionário.
# Para realizar o cálculo receba o valor do salário bruto e o adicional dos benefícios.
# O salário a ser transferido é calculado da seguinte forma:
# Salário a ser transferido = Salário bruto + Adicional do benefícios - Imposto mediante ao salário.
# Para calcular o percentual de imposto segue as aliquotas:
# De R$0,00 a R$1100,00 = 5,00%
# De R$1100,01 a R$2500,00 = 10,00%
# Acima de R$2500,00 = 15,00%


def calcular_imposto(salario):
    aliquota=0.0
    if (salario >=0 and salario <= 1100):
       aliquota=0.5
    elif (salario>1100 and salario<2500):
        aliquota = 0.1
    elif (salario>2500):
        aliquota = 0.15
       
    return aliquota * salario
    
valor_salario = float(input())
valor_beneficios = float(input())

valor_imposto = calcular_imposto(valor_salario)

saida = valor_salario - valor_imposto + valor_beneficios
print(f'{saida:.2f}')
