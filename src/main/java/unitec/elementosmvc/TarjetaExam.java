
package unitec.elementosmvc;

/**
 *
 * @author por yo merengues
 */
public class TarjetaExam {
    
   private int numero;
   private float saldo;
   private String nombre;

    public TarjetaExam() {
    }

    public TarjetaExam(int numero, float saldo, String nombre) {
        this.numero = numero;
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
