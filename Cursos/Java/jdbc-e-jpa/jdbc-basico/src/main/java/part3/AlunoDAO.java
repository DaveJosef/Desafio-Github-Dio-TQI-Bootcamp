package part3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    /**
     * Consulta
     * @return lista de alunos
     */
    public List<Aluno> list() {

        // lista que armazena alunos do banco
        ArrayList<Aluno> alunos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection()) {

            // SQL preparado
            String sql = "SELECT * FROM aluno";

            // Statement preparado
            PreparedStatement stmt = con.prepareStatement(sql);

            // Executa e armazena resultado
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                // Instanciar aluno armazenando-o na lista
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                int idade = resultSet.getInt("idade");
                String estado = resultSet.getString("estado");

                alunos.add(new Aluno(
                        id,
                        nome,
                        idade,
                        estado
                ));

            }

        } catch (SQLException e) {
            System.out.println("Falha na listagem de alunos");
            e.printStackTrace();
        }

        return alunos;

    }

    /**
     * Consulta com filtro
     * @param id id do aluno
     * @return aluno
     */
    public Aluno getById(int id) {

        // aluno que irá armazenar o resultado
        Aluno aluno = new Aluno();

        try (Connection con = ConnectionFactory.getConnection()) {

            // SQL preparado
            String sql = "SELECT * FROM aluno WHERE ID = ?";

            // Statement preparado com os parâmetros
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            // Executa e armazena resultado
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {

                // atualizar o aluno com valores do banco
                aluno.setId(resultSet.getInt("id"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setIdade(resultSet.getInt("idade"));
                aluno.setEstado(resultSet.getString("estado"));

            }

        } catch (SQLException e) {
            System.out.println("Falha na recuperação de aluno");
            e.printStackTrace();
        }

        return aluno;

    }

    /**
     * Inserção
     * @param aluno aluno com informações a serem inseridas
     * @return void
     */
    public void create(Aluno aluno) {

        try (Connection con = ConnectionFactory.getConnection()) {

            // SQL preparado para inserção
            String sql = "INSERT INTO aluno(nome, idade, estado) VALUES(?, ?, ?)";

            // Statement preparado com os parâmetros
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEstado());

            // Executa e armazena resultado (número de linhas afetadas)
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Inserção bem sucedida. " + rowsAffected + " linhas afetadas");

        } catch (SQLException e) {
            System.out.println("Falha na inserção de aluno");
            e.printStackTrace();
        }

    }

    /**
     * Deleção
     * @param id id do aluno
     * @return void
     */
    public void delete(int id) {

        try (Connection con = ConnectionFactory.getConnection()) {

            // SQL preparado para deleção
            String sql = "DELETE FROM aluno WHERE id = ?";

            // Statement preparado com os parâmetros
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            // Executa e armazena resultado (número de linhas afetadas)
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Deleção bem sucedida. " + rowsAffected + " linhas afetadas");

        } catch (SQLException e) {
            System.out.println("Falha na deleção de aluno");
            e.printStackTrace();
        }

    }

    /**
     * Atualização
     * @param aluno aluno com informações a serem inseridas
     * @return void
     */
    public void update(Aluno aluno) {

        try (Connection con = ConnectionFactory.getConnection()) {

            // SQL preparado para atualização
            String sql = "UPDATE aluno SET nome = ?, idade = ?, estado = ? WHERE id = ?";

            // Statement preparado com os parâmetros
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEstado());
            stmt.setInt(4, aluno.getId());

            // Executa e armazena resultado (número de linhas afetadas)
            int rowsAffected = stmt.executeUpdate();

            System.out.println("Atualização bem sucedida. " + rowsAffected + " linhas afetadas");

        } catch (SQLException e) {
            System.out.println("Falha na atualização de aluno");
            e.printStackTrace();
        }

    }

}
