package unitec.elementosmvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego
 */

@RestController //controlador de mvc con arquitectura REST
@RequestMapping("/api") //raiz donde se alojan todos los servicios
@CrossOrigin //mantener origenes cruzados
public class ControladorMensaje {
    
    @Autowired RepositorioMensaje mensa;

    //A) busscar todos
    @GetMapping("/mensaje")
    public List<Mensaje> buscarTodos(){
        return mensa.findAll();
    }
    
    //B) buscar por id
    @GetMapping("/mensaje/{id}")
    public Mensaje buscarPorId(@PathVariable String id){
        Mensaje Rmensa = new Mensaje();
        
        return mensa.findById(id).get();
    }
}
