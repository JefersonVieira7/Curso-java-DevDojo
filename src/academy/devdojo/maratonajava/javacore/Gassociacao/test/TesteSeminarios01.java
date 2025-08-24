package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class TesteSeminarios01 {
    public static void main(String[] args) {
        Local local = new Local("Salvador, Nova Brasília de Itapuã");
        Aluno aluno = new Aluno("Jeferson", 18);
        Professor professor = new Professor("JefersonDev", "Programação e negócios");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Programaçã com Java", alunosParaSeminario, local);

        Seminario[] seminariosDisponíveis = {seminario};

        professor.setSeminarios(seminariosDisponíveis);

        
        professor.imprime();
    }
}
