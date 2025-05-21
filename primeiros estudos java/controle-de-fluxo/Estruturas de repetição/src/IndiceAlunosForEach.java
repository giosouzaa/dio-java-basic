public class IndiceAlunosForEach {

    //Exemplo de controle de repetição com ForEach
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //forma abreviada
        for (String aluno : alunos){
        System.out.println("Nome do aluno: " + aluno);
        }
    }
}
