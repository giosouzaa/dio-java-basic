public class TiposDados {
    public static void main(String[] args) throws Exception {
        int idade; // Tipo "int", nome "idade", sem valor atribuído
        int anoFabricacao = 2021; // Tipo "int", nome "anoFabricacao", com valor atribuídpo
        double salarioMinimo = 2500; // Tipo "double", nome "salarioMinimo", com valor atribuído

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, tavez tenha que se utilizar outro tipo de variável (string)
        long cep = 98765432109L; // Se começar com zero, talvez tenha que se utilizar outro tipo de variável (string)
        // tipo "long" deve ser acrescido de um "L" ao final para não ser confundido co, o tipo "int"
        float pi = 3.14F; // Deve-se acrescentar um "F" ao final para indicar o tipo (pode ser maiúsculo ou minúsculo), caso contrário a variável será interpretada como tipo "double" e haverá erro no código
        double salario = 1275.33;
    }
} 
