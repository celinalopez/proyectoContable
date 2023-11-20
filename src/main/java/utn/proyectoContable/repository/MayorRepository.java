package utn.proyectoContable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.proyectoContable.model.Mayor;

@Repository
public interface MayorRepository extends JpaRepository<Mayor, Integer> {
}
