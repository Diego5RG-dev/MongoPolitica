package AD;

import AD.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Secuencial implements CommandLineRunner {

    @Autowired
    private PaisService paisService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- INICIANDO SECUENCIA DA PRÁCTICA ---");

        // 1. Inserción de datos (desde JSON) [cite: 11, 16]
        paisService.importarJson("datos.json");

        // 2. Lectura inicial [cite: 12, 16]
        System.out.println("Datos iniciais:");
        paisService.listarTodo("España").forEach(System.out::println);

        // 3. Modificación [cite: 13, 17]
        paisService.modificarOrganizacion("España", "Monarquía Parlamentaria");

        // 4. Lectura dos datos modificados [cite: 17]
        System.out.println("Datos tras a modificación:");
        System.out.println(paisService.listarTodo("España"));

        // 5. Eliminación [cite: 14, 17]
        paisService.borrarTodo();
        System.out.println("Base de datos limpa. Secuencia finalizada.");
    }
}