package exercicio2;

public class App {

    public static void main(String[] args) {

        Faculdade faculdade1 = new Faculdade("SPTech");

        Aluno aluno1 = new Aluno("02221070", "Guilherme", 2);
        Aluno aluno2 = new Aluno("02221071", "Diego", 2);
        Aluno aluno3 = new Aluno("02221028", "Jaqueline", 1);
        Aluno aluno4 = new Aluno("02221050", "Martha", 1);

        faculdade1.matricularAluno(aluno1);
        faculdade1.matricularAluno(aluno2);
        faculdade1.matricularAluno(aluno3);
        faculdade1.matricularAluno(aluno4);

        faculdade1.exibirAlunos();
        
        faculdade1.exibirAlunosPorSemestre(2);

        faculdade1.cancelarMatricula("02221050");
        
        faculdade1.exibirCancelados();
    }
}
