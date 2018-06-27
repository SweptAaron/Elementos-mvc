
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-107
 */
public interface RepositorioCliente extends MongoRepository<ClieteExam, String>{
    public ClieteExam findByNumero(String nombre);
}
