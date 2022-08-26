package br.com.dio.collection.map.paraSaberMais;

import java.util.*;

/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
*/
public class ExemploComparatorMapObjetoObjeto {

    public static void main(String[] args) {

        Aluno aluno2 = new Aluno("Jon", 124);
        Aluno aluno3 = new Aluno("Simba", 125);
        Aluno aluno1 = new Aluno("Camila", 123);

        Disciplina disciplina3 = new Disciplina("Python", 9);
        Disciplina disciplina1 = new Disciplina("Java", 10);
        Disciplina disciplina2 = new Disciplina("JavaScript", 12);

        Map<Disciplina, Aluno> cursos = new HashMap<>() {{
            put(disciplina1, aluno1);
            put(disciplina2, aluno2);
            put(disciplina3, aluno3);
        }};

        System.out.println("Exibindo Dicionário:");
        for (Map.Entry<Disciplina, Aluno> entry :
             cursos.entrySet() ) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }

        System.out.println("-------\n" + "Nome Disciplina:");
        Map<Disciplina, Aluno> cursos2 = new TreeMap<>(cursos);
        for (Map.Entry<Disciplina, Aluno> entry :
                cursos2.entrySet() ) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }

        System.out.println("-------\n" + "Duração Disciplina:");
        Map<Disciplina, Aluno> cursos3 = new TreeMap<>(new ComparatorDuracaoDisciplina());
        cursos3.putAll(cursos);
        for (Map.Entry<Disciplina, Aluno> entry :
                cursos3.entrySet() ) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }

        System.out.println("-------\n" + "Nome do Aluno:");
        TreeSet<Map.Entry<Disciplina, Aluno>> set = new TreeSet<>(new ComparatorNomeAluno());
        set.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry :
                set ) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }

        System.out.println("-------\n" + "Matricula do Aluno:");
        TreeSet<Map.Entry<Disciplina, Aluno>> set1 = new TreeSet<>(new ComparatorMatriculaAluno());
        set1.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry :
                set1 ) {
            System.out.println(entry.getKey() + " _ " + entry.getValue());
        }

    }
}

//Crie uma classe Curso que possua os atributos: nome, disciplina.
class Disciplina implements Comparable<Disciplina> {

    private String nome;
    private Integer duracao;

    public Disciplina(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(nome, that.nome) &&
                Objects.equals(duracao, that.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }

    @Override
    public int compareTo(Disciplina disciplina) {
        return this.getNome().compareToIgnoreCase(disciplina.getNome());
    }
}

//Crie uma classe Aluno que possua os atributos: nome, matricula.
class Aluno {

    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) &&
                Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}

class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {

    @Override
    public int compare(Disciplina d1, Disciplina d2) {
        return Integer.compare(d1.getDuracao(), d2.getDuracao());
    }
}

class ComparatorNomeAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Map.Entry<Disciplina, Aluno> a1, Map.Entry<Disciplina, Aluno> a2) {
        return a1.getValue().getNome().compareToIgnoreCase(a2.getValue().getNome());
    }
}

class ComparatorMatriculaAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {

    @Override
    public int compare(Map.Entry<Disciplina, Aluno> a1, Map.Entry<Disciplina, Aluno> a2) {
        return Integer.compare(a1.getValue().getMatricula(), a2.getValue().getMatricula());
    }
}
