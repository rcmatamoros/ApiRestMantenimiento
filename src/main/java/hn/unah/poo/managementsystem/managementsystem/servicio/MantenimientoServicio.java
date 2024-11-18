package hn.unah.poo.managementsystem.managementsystem.servicio;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.modelmapper.ModelMapper;

import hn.unah.poo.managementsystem.managementsystem.dtos.MantenimientoDTO;
import hn.unah.poo.managementsystem.managementsystem.modelo.Mantenimiento;
import hn.unah.poo.managementsystem.managementsystem.repositorio.MantenimientoRepositorio;

//tendra la logica de todos los metodos que seran llamados desde el controlador
@Service
public class MantenimientoServicio {

    //En servicio se instancia Repositorio y tmb modelmapper
    @Autowired
    private MantenimientoRepositorio mRepositorio;

    private ModelMapper modelMapper;

    //metodo obtener todos

    
    
    public List<Mantenimiento> getAllM(){
        return mRepositorio.findAll();

    }

    public String createUser(MantenimientoDTO nvoMantenimiento){
        if(this.mRepositorio.existsById(nvoMantenimiento.getCodigoUsuario())){
            return "Ya existe el cliente";
        }
        modelMapper = new ModelMapper();
        Mantenimiento nvoMantenimientoBd = this.modelMapper.map(nvoMantenimiento, Mantenimiento.class);

        this.mRepositorio.save(nvoMantenimientoBd);
        return "Cliente almacenado correctamente";
    }
    public String deleteUserPorId(String codigoUsuario){
        if(!this.mRepositorio.existsById(codigoUsuario)){
            return "No existe el cliente";
        }
        this.mRepositorio.deleteById(codigoUsuario);
        return "Cliente eliminado satisfactoriamente";
    }
        
    public String eliminarClientePorId(String codigoUsuario){
        if(!this.mRepositorio.existsById(codigoUsuario)){
            return "No existe el cliente";
        }
        this.mRepositorio.deleteById(codigoUsuario);
        return "Cliente eliminado satisfactoriamente";
    }

   public String updateMantenimiento(String codigoUsuario, MantenimientoDTO mantenimiento) {
    if(!this.mRepositorio.existsById(mantenimiento.getCodigoUsuario())){
        return "No existe cliente a actualizar";
    }
    modelMapper = new ModelMapper();
    Mantenimiento mantenimientoUpdate = this.modelMapper.map(mantenimiento, Mantenimiento.class);
    this.mRepositorio.save(mantenimientoUpdate);
    return "El cliente "+ mantenimiento.getCodigoUsuario() + "actualizado satisfactoriamente";

        }
   
}
