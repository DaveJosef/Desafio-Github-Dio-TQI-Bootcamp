package dio.springboot.app;

import dio.springboot.app.model.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaUsuario implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Usuario david = criarUsuarioDavid();
        Usuario admin = criarUsuarioAdmin();

        Iterable<Usuario> usuarios = null;
        usuarios.forEach(
                u -> System.out.println(u.getNomeCompleto() + " - " + u.getLogin())
        );
    }

    private Usuario criarUsuarioDavid() {
        Usuario usuario = new Usuario();
        usuario.setEmail("david@dio.com.br");
        usuario.setLogin("david");
        usuario.setNomeCompleto("DAVID OLIVEIRA");
        usuario.setSenha("diospringjpa");
        return usuario;
    }

    private Usuario criarUsuarioAdmin() {
        Usuario usuario = new Usuario();
        usuario.setEmail("admin@dio.com.br");
        usuario.setLogin("admin");
        usuario.setNomeCompleto("ADMINISTRADOR");
        usuario.setSenha("masterpass");
        return usuario;
    }
}
