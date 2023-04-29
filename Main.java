public class Main {
    public static void main(String[] args){
        
        //criar um curso
        Curso curso = new Curso("Ciencia da Computacao", 4);

        //criar disciplinas
        Disciplina prog1 = new Disciplina(null, "Programacao 1", 0, null, null);
        Disciplina prog2 = new Disciplina(null, "Programacao 2", 0, null, null);

        //adicionar as disciplinas ao curso
        curso.adicionarDisciplina(prog1);
        curso.adicionarDisciplina(prog2);

        //criar alunos
        Aluno aluno1 = new Aluno("0001", "Joao", null, null, null);
        Aluno aluno2 = new Aluno("0002", "Maria", null, null, null);
        
        //matricular os alunos em disciplinas
        curso.matricularAlunoEmDisciplina(aluno1, prog1);
        curso.matricularAlunoEmDisciplina(aluno1, prog2);
        curso.matricularAlunoEmDisciplina(aluno2, prog2);

        //imprime a lista de alunos matriculados no curso
        System.out.println("Alunos matriculados no curso:");
        for(Disciplina disciplina : curso.getListaDeDisciplinas()){
            for(Matriculado matriculado : disciplina.getListaDeMatriculados()){
                System.out.println(matriculado.getAluno().getNome());
            }
        }

        //imprime a lista de alunos matriculados na disciplina de programacao 2
        System.out.println("Alunos matriculados em Programacao 2:");
        for(Matriculado matriculado : prog2.getListaDeMatriculados()){
            System.out.println(matriculado.getAluno().getNome());
        }


    }
}