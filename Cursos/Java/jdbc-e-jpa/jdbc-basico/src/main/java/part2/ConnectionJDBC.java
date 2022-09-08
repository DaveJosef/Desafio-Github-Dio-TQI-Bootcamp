package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

        /*
            Parâmetros para conectar-se ao banco MySQL
         */

        String driver = "mysql";
        String databaseAddress = "localhost";
        String databaseName = "digital_innovation_one";
        String user = "root";
        String password = "password";

        /*
            3. String de conexão
         */

        StringBuilder stringBuilder = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(databaseAddress).append("/")
                .append(databaseName).append("?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC");

        String connectionUrl = stringBuilder.toString();

        /*
            ... Carregar a classe de implementação do driver (a partir da versão 4 do JDBC não é mais necessário) Class.forName("com.mysql.jdbc.Driver");
            4. Efetuar conexão com DriverManager, passando string de conexão, nome de usuário e senha
         */

        try (Connection con = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("Conexão realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Houve um erro ao se conectar ao MySQL");
            e.printStackTrace();
        }

    }
}
