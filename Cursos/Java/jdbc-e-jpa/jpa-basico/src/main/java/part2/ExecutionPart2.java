package part2;

import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart2 {

    public static void main(String[] args) {

        /*
            1. Criar um gerenciador de entidades
         */
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*
            2.1 Criar instâncias para persistir no Banco
         */
        Estado estadoParaAdd = new Estado("Rio de Janeiro", "RJ");
        Aluno alunoParaAdd = new Aluno("David", 29, estadoParaAdd);

        /*
            2.2 Persistir instâncias com transação
         */
        entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdd);
        entityManager.persist(alunoParaAdd);

        entityManager.getTransaction().commit();

        /*
            3. Resgatar instâncias com transação
         */
//        Estado estadoEncontrado = entityManager.find(Estado.class, 1);
//        Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);
//
//        System.out.println(estadoEncontrado);
//        System.out.println(alunoEncontrado);
//
        /*
            4. Alterar instâncias com transação
         */
//        entityManager.getTransaction().begin();
//
//        alunoEncontrado.setNome("Karam");
//        alunoEncontrado.setIdade(20);
//
//        entityManager.getTransaction().commit();

        /*
            5. Remover instâncias com transação
         */
//        entityManager.getTransaction().begin();
//
//        entityManager.remove(alunoEncontrado);
//
//        entityManager.getTransaction().commit();

        /*
            Fechar entityManagerFactory e entityManager
         */
        entityManager.close();
        entityManagerFactory.close();

    }
}
