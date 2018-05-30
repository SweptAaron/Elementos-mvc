package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner{

    @Autowired ServicioTarjeta servicio;
    @Autowired RepositorioMensaje repoMensaje;
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvcApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        //LocalDate fecha= LocalDate.now();
        //repoMensaje.save(new Mensaje("Hola",fecha,"Cerdito"));
        
        //Buacarmos todos los mensajes ya
       /*for(Mensaje mensa: repoMensaje.findAll()){
           System.out.println(mensa);
       }*/
       
       
       //Bucaremos un mensaje por ID
        //System.out.println(repoMensaje.findByCuerpo("Cerdito"));
       
        //borrar por id
        /*Mensaje  n = new Mensaje();
        n.setId("Hola");
        repoMensaje.delete(n);
        */
        
    }
}
