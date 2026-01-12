package AD.services;

import AD.model.Pais;
import AD.repository.PaisRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class PaisService {
    @Autowired
    private PaisRepository repo;

    @Autowired
    private ObjectMapper objectMapper; // Para ler o JSON

    // Inserir datos desde JSON
    public void importarJson(String path) throws IOException {
        InputStream is = new ClassPathResource(path).getInputStream();
        List<Pais> paises = objectMapper.readValue(is, new TypeReference<List<Pais>>(){});
        repo.saveAll(paises);
    }

    // Ler datos
    public List<Pais> listarTodo(String españa) {
        return repo.findAll();
    }

    // Modificar datos
    public void modificarOrganizacion(String nome, String novaOrg) {
        Pais p = repo.findByNome(nome);
        if(p != null) {
            p.setOrganizacion(novaOrg);
            repo.save(p);
        }
    }

    // Eliminar datos
    public void borrarTodo() {
        repo.deleteAll();
    }
}