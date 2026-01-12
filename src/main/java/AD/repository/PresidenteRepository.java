package AD.repository;


import AD.model.Presidente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PresidenteRepository extends MongoRepository<Presidente, String> {
    Presidente findByNomPresidente(String nome);
    void deleteByNomPresidente(String nome);
}
