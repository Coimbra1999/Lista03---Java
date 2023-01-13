package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        for (Aluno aluno : alunos) {
            if(aluno.getRa().equals(ra)){
                System.out.println("-".repeat(30));
                System.out.println("Aluno cancelado: " + aluno.getNome());
                System.out.println("-".repeat(30));
                aluno.setIsAtivo(false);
            }
        }
    }
    
    public void exibirAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado.");
        }else{
            System.out.println("-".repeat(30));
            System.out.println("Alunos matriculados: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
            System.out.println("-".repeat(30));
        }
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
            System.out.println("-".repeat(30));
            System.out.println("Alunos do " + semestre + " semestre: ");
        for (Aluno aluno : alunos) {
            if(aluno.getSemestre() == semestre){
                System.out.println(aluno.getNome());
            }
        }
            System.out.println("-".repeat(30));
    }
    
    public void exibirCancelados(){
        for (Aluno aluno : alunos) {
            if(!aluno.getIsAtivo()){
            System.out.println("-".repeat(30));
            System.out.println("Aluno(s) cancelados: " + aluno.getNome());
            System.out.println("-".repeat(30));
            }
        }
    }
}
