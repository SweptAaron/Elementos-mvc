package unitec.elementosmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    //C) Guardar
    
    @PostMapping("/mensaje")
    public Estatus guardar(@RequestBody String json) throws Exception{
        //Pirmero convertimos este String Json a un objeto java
        ObjectMapper maper = new ObjectMapper();
        Mensaje mensaje = maper.readValue(json, Mensaje.class);
        mensa.save(mensaje);
        System.out.println("Este objeto se convirtio: "+mensaje);
        Estatus estatus = new Estatus();
        estatus.setSucces(true);
        estatus.setMensaje("Mensaje Guardado con exito");
        return estatus;
    }
    
    @DeleteMapping("/mensaje/borrar/{id}")
    public Estatus borrar(@PathVariable String id) throws Exception{
        mensa.deleteById(id);
        Estatus estatus = new Estatus();
        estatus.setSucces(true);
        estatus.setMensaje("Mensaje Borrado con exito");
        return estatus;
    }
    
    @PutMapping("/mensaje")
    public Estatus update(@RequestBody String json) throws Exception{
        ObjectMapper maper = new ObjectMapper();
        Mensaje mensaje = maper.readValue(json, Mensaje.class);
        mensa.save(mensaje);
        Estatus estatus = new Estatus();
        estatus.setSucces(true);
        estatus.setMensaje("Mensaje actualizado con exito");
        return estatus;
    }
}
