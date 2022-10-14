package dio.springboot.app;

import dio.springboot.app.model.Usuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SIstemaUsuario implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setEmail("david@dio.com.br");
        usuario.setLogin("david");
        usuario.setNomeCompleto("DAVID OLIVEIRA");
        usuario.setSenha("diospringjpa");
        //repositório de persistência ??
    }
}
