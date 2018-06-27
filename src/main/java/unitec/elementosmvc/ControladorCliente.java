
package unitec.elementosmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */

 @RestController //controlador para los servicios REST
 @RequestMapping("/api")
 @CrossOrigin 
public class ControladorCliente {
   
    @Autowired RepositorioCliente repocliente;
   
}
