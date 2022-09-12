package part3;


import classes.Aluno;
import classes.Aluno_;
import classes.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class ExecutionPart3 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /*
            1. Criar instâncias para persistir no Banco
         */
        entityManager.getTransaction().begin();

        Estado estadoParaAdd = new Estado("Rio de Janeiro", "RJ");
        entityManager.persist(estadoParaAdd);
        entityManager.persist(new Estado("Sao Paulo", "SP"));
        entityManager.persist(new Aluno("David", 29, estadoParaAdd));
        entityManager.persist(new Aluno("Joao", 20, estadoParaAdd));
        entityManager.persist(new Aluno("Pedro", 30, estadoParaAdd));

        entityManager.getTransaction().commit();

        /*
            2. método EntityManager.find(), SQL nativo, JPQL e JPA Criteria API
         */
        /*
            2.1. parâmetro de busca
         */
        String nome = "David";

        /*
            2.2. método EntityManager.find()
         */
        Aluno alunoEntityManager = entityManager.find(Aluno.class, 1);

        System.out.println("Consulta alunoEntityManager: " + alunoEntityManager);

        /*
            2.3. SQL nativo
         */
        String sql = "SELECT * FROM Aluno WHERE nome = :nome ";

        Aluno alunoSQL = (Aluno) entityManager.createNativeQuery(sql, Aluno.class).setParameter("nome", nome).getSingleResult();

        String sqlList = "SELECT * FROM Aluno";

        List<Aluno> alunoSQLList = entityManager.createNativeQuery(sqlList, Aluno.class).getResultList();

        System.out.println("Consulta alunoSQL: " + alunoSQL);
        alunoSQLList.forEach(aluno -> System.out.println("Consulta alunoSQLList: " + aluno));

        /*
            2.4. JPQL
         */
        String jpql = "SELECT a FROM Aluno a WHERE a.nome = :nome ";

        Aluno alunoJPQL = (Aluno) entityManager.createQuery(jpql, Aluno.class).setParameter("nome", nome).getSingleResult();

        String jpqlList = "SELECT a FROM Aluno a WHERE a.estado = :estado ";

        List<Aluno> alunoJPQLList = entityManager.createQuery(jpqlList, Aluno.class).setParameter("estado", estadoParaAdd).getResultList();

        System.out.println("Consulta alunoJPQL: " + alunoJPQL);
        alunoJPQLList.forEach(aluno -> System.out.println("Consulta alunoJPQLList: " + aluno));

        /*
            2.5. JPA Criteria API + JPA Metamodel
         */
        CriteriaQuery<Aluno> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Aluno.class);
        Root<Aluno> alunoRoot = criteriaQuery.from(Aluno.class);
        CriteriaBuilder.In<String> inClause = entityManager.getCriteriaBuilder().in(alunoRoot.get(Aluno_.nome));
        inClause.value(nome);
        criteriaQuery.select(alunoRoot).where(inClause);
        Aluno alunoAPICriteria = entityManager.createQuery(criteriaQuery).getSingleResult();

        CriteriaQuery<Aluno> criteriaQueryList = entityManager.getCriteriaBuilder().createQuery(Aluno.class);
        Root<Aluno> alunoRootList = criteriaQueryList.from(Aluno.class);
        List<Aluno> alunoAPICriteriaList = entityManager.createQuery(criteriaQueryList).getResultList();

        System.out.println("Consulta alunoAPICriteria: " + alunoAPICriteria);
        alunoAPICriteriaList.forEach(aluno -> System.out.println("Consulta alunoAPICriteriaList: " + aluno));
    }
}
