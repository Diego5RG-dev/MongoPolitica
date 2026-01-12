package AD.repository;

import AD.model.Pais;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface PaisRepository extends MongoRepository<Pais, String> {
    Pais findByNome(String nome);
    void deleteByNome(String nome);
}