package part1;

import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart1 {

    public static void main(String[] args) {

        /*
            1. Criar um gerenciador de entidades
         */
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1-DIO");
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
            Fechar entityManagerFactory e entityManager
         */
        entityManager.close();
        entityManagerFactory.close();

    }
}
