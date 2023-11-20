package utn.proyectoContable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.proyectoContable.model.LibroDiario;

@Repository
public interface LibroDiarioRepository extends JpaRepository<LibroDiario, Integer>{
}
