package utn.proyectoContable.servicio;

import utn.proyectoContable.model.PlanDeCuentas;

import java.util.List;

public interface PlanServicio {
    public List<PlanDeCuentas> listarPlanDeCuentas();

    public PlanDeCuentas guardarPlanDeCuentas(PlanDeCuentas planDeCuentas);

    public PlanDeCuentas obtenerPlanDeCuentasPorId(Integer id);
    public PlanDeCuentas updatePlanDeCuentas(PlanDeCuentas planDeCuentas);

    public void deletePlanDeCuentas(Integer id);
}
