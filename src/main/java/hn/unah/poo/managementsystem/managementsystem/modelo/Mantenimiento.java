package hn.unah.poo.managementsystem.managementsystem.modelo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="mantenimiento")
public class Mantenimiento {


    //Es posible que se necesite usar @Column(name="codigousuario")
    @Id
    private String codigoUsuario;

    private String nombre;
    private String apellido;
    private String depto;
    private String correo;
    private String telefono;

}
