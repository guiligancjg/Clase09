import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

}
