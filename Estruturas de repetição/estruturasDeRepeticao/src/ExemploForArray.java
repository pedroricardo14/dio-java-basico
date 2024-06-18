public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays, o índice inicia em ZERO 
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
/* 
        for(int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x=" + x + " é " + alunos[x]);
            */

        for(String aluno : alunos){
            // Eu tenho o array alunos, à cada execução, essa variável aluno vai obter um novo valor.
            System.out.println("Nome do aluno é:" + aluno);
        }
        }
    }

