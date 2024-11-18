package hn.unah.poo.managementsystem.managementsystem.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.managementsystem.managementsystem.dtos.MantenimientoDTO;
import hn.unah.poo.managementsystem.managementsystem.modelo.Mantenimiento;
import hn.unah.poo.managementsystem.managementsystem.servicio.MantenimientoServicio;

@RestController
@RequestMapping("/api/mantenimiento")
public class MantenimientoController {
    
    @Autowired
    private MantenimientoServicio mServicio;

 /*   @GetMapping("/obtener/dni")
    public Optional<ClienteDTO> obtenerPorId(@RequestParam(name="dni") String dni) {
        return this.clienteServicio.obtenerPorDni(dni);
    }
*/
    @GetMapping("/obtener")
    public List<Mantenimiento> getAllM() {
        return this.mServicio.getAllM();
    }

    @PostMapping("/crear/nuevo")
    public String createUser(@RequestBody MantenimientoDTO entity) {
        return this.mServicio.createUser(entity);
    }

    @DeleteMapping("/eliminar/{codigoUsuario}")
    public String eliminarClientePorId(@PathVariable(name="codigoUsuario") String codigoUsuario){
        return this.mServicio.eliminarClientePorId(codigoUsuario);
    }

    @PutMapping("/actualizar/{codigoUsuario}")
    public String putMethodName(@PathVariable(name="codigoUsuario") String codigoUsuario, 
                                @RequestBody MantenimientoDTO mantenimiento) {
        return this.mServicio.updateMantenimiento(codigoUsuario, mantenimiento);
    }
    



}
