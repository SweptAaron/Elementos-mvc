
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author T-107
 */
public interface RepositorioMensaje extends MongoRepository<Mensaje, String>{
    public Mensaje findByCuerpo(String cuerpo);
}
