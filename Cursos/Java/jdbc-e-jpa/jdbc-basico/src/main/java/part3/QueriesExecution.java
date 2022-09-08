package part3;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        /*
            Consulta
         */
        List<Aluno> alunos = alunoDAO.list();
        alunos.stream().forEach(System.out::println);


        /*
            Consulta com filtro
         */
        Aluno alunoParaConsulta = alunoDAO.getById(1);
//        System.out.println(alunoParaConsulta);


        /*
            Inserção
         */
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );
//        alunoDAO.create(alunoParaInsercao);

        /*
            Deleção
         */
//        alunoDAO.delete(1);


        /*
            Atualização
         */
        Aluno alunoParaAtualizar = alunoDAO.getById(3);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

//        alunoDAO.update(alunoParaAtualizar);

    }
}
