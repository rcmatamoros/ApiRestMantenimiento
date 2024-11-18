package hn.unah.poo.managementsystem.managementsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MantenimientoDTO {

    private String codigoUsuario;

    private String nombre;

    private String apellido;
    private String depto;
    private String correo;
    private String telefono;

}
