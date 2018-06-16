
package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Diego
 */
public class Mensaje {
    
    @Id
    private String id;
    private LocalDate fecha;
    private String cuerpo;

    public Mensaje() {
    }

    public Mensaje(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", fecha=" + fecha + ", cuerpo=" + cuerpo + '}';
    }

    public Mensaje(String id, LocalDate fecha, String cuerpo) {
        this.id = id;
        this.fecha = fecha;
        this.cuerpo = cuerpo;
    }
    
    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    Mensaje(LocalDate fecha, String mi_priemr_Mensaje) {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

   public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
