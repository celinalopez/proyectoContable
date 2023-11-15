package utn.proyectoContable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.proyectoContable.model.PlanDeCuentas;

public interface PlanRepository extends JpaRepository<PlanDeCuentas, Integer> {
}
