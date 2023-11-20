package utn.proyectoContable.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.proyectoContable.model.PlanDeCuentas;
import utn.proyectoContable.repository.PlanRepository;

import java.util.List;

@Service
public class PlanServicioImpl implements PlanServicio{

    @Autowired
    private PlanRepository repository;
    @Override
    public List<PlanDeCuentas> listarPlanDeCuentas() {
        return repository.findAll();
    }

    @Override
    public PlanDeCuentas guardarPlanDeCuentas(PlanDeCuentas planDeCuentas) {
        return repository.save(planDeCuentas);
    }

    @Override
    public PlanDeCuentas obtenerPlanDeCuentasPorId(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public PlanDeCuentas updatePlanDeCuentas(PlanDeCuentas planDeCuentas) {
       return repository.save(planDeCuentas);
    }

    @Override
    public void deletePlanDeCuentas(Integer id) {
        repository.deleteById(id);
    }


}
