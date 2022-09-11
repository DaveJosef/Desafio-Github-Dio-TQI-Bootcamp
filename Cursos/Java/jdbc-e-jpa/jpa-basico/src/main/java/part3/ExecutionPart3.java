package part3;


import classes.Aluno;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart3 {

    public static void main(String[] args) {

        /*
            1. Criar um gerenciador de entidades
         */
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*
            2.1 Criar instâncias para persistir no Banco
         */
        entityManager.getTransaction().begin();

        Estado estadoParaAdd = new Estado("Rio de Janeiro", "RJ");
        entityManager.persist(estadoParaAdd);
        entityManager.persist(new Estado("Sao Paulo", "SP"));
        entityManager.persist(new Aluno("Daniel", 29, estadoParaAdd));
        entityManager.persist(new Aluno("Joao", 20, estadoParaAdd));
        entityManager.persist(new Aluno("David", 29, estadoParaAdd));

        entityManager.getTransaction().commit();

    }
}
