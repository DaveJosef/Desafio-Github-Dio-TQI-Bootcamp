package br.com.dio.collection.map.paraSaberMais;

import java.util.*;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com o seguintes requisito:
Key: Nome do aluno e matrícula - Value: Nome das disciplinas na qual estão matriculados
*/
public class ExemploComparatorMapObjetoSet {

    public static void main(String[] args) {

        Aluno aluno2 = new Aluno("Jon", 124);
        Aluno aluno3 = new Aluno("Simba", 125);
        Aluno aluno1 = new Aluno("Camila", 123);

        Disciplina disciplina3 = new Disciplina("Python", 9);
        Disciplina disciplina1 = new Disciplina("Java", 10);
        Disciplina disciplina2 = new Disciplina("JavaScript", 12);

        Set<Disciplina> disciplinas1 = new HashSet<>(Arrays.asList(disciplina1, disciplina2));
        Set<Disciplina> disciplinas2 = new HashSet<>(Arrays.asList(disciplina2, disciplina3));
        Set<Disciplina> disciplinas3 = new HashSet<>(Arrays.asList(disciplina1, disciplina3));

        Map<Aluno, Set<Disciplina>> alunosEDisciplinas = new HashMap<>() {{
            put(aluno1, disciplinas1);
            put(aluno2, disciplinas2);
            put(aluno3, disciplinas3);
        }};

//        System.out.println(alunosEDisciplinas);
        System.out.println("Exibindo Dicionário:");
        for (Map.Entry<Aluno, Set<Disciplina>> entry :
                alunosEDisciplinas.entrySet()) {
            System.out.print(entry.getKey().getNome() + " - " + entry.getKey().getMatricula() + ": ");
            for (Disciplina entry1 :
                    entry.getValue()) {
                System.out.print(entry1.getNome() + " ");
            }
            System.out.println();
        }

    }
}
