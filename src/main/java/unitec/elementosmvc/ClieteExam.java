
package unitec.elementosmvc;

import org.springframework.data.annotation.Id;

/**
 *
 * @author por yo merengues
 */
public class ClieteExam {
    
    @Id
    private String id;
    private TarjetaExam tarjeta; 
    private String nombre;
    
    public ClieteExam() {
    }

    public ClieteExam(String id,String nombre, TarjetaExam tarjeta) {
        this.id=id;
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TarjetaExam getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaExam tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
