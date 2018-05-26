
package unitec.elementosmvc;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Diego Aaron
 */

@Configuration
public class ServicioTarjeta {
    Tarjeta obtenerSaldo(){
        return new Credito();
    }
}
