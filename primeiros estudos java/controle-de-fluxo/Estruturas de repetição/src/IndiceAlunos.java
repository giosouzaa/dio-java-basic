public class IndiceAlunos {

    //Exemplo de controle de repetição com for em arrays
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        //em arrays, o índice inicia em zero
        for (int x=0; x<alunos.length; x++){
        System.out.println("O aluno no índice x=" + (x+1) + " é " + alunos[x]);
        }
    }
}
