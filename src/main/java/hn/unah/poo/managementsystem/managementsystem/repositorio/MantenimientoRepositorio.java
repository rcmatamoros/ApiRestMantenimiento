package hn.unah.poo.managementsystem.managementsystem.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.managementsystem.managementsystem.modelo.Mantenimiento;

@Repository
public interface MantenimientoRepositorio extends JpaRepository<Mantenimiento,String> {
}
