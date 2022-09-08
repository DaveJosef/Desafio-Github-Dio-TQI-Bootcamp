package part3;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        // declarando objeto de conexão
        Connection connection = null;

        // carregar arquivo de propriedades para se comunicar apropriadamente com o banco
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {

            // parâmetros de conexão
            Properties properties = new Properties();
            properties.load(input);

            String driver = properties.getProperty("jdbc.driver");
            String databaseAddress = properties.getProperty("db.address");
            String databaseName = properties.getProperty("db.name");
            String user = properties.getProperty("db.user.login");
            String password = properties.getProperty("db.user.password");

            // String de conexão
            StringBuilder stringBuilder = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(databaseAddress).append("/")
                    .append(databaseName).append("?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC");

            String connectionUrl = stringBuilder.toString(); // == jdbc:mysql://localhost/digital_innovation_one

            // Efetuar conexão com DriverManager, passando string de conexão, nome de usuário e senha
            try {
                connection = DriverManager.getConnection(connectionUrl, user, password);
            } catch (SQLException e) {
                System.out.println("Houve um erro ao se conectar ao MySQL");
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivos de propriedades");
            e.printStackTrace();
        }

        return connection;
    }
}
