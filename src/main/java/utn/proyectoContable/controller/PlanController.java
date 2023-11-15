package utn.proyectoContable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utn.proyectoContable.model.PlanDeCuentas;
import utn.proyectoContable.repository.PlanRepository;

import java.util.List;

@RestController
public class PlanController {
    @Autowired
    private PlanRepository todoRepository;

    @GetMapping(value= "/")
    public String holaMundo(){
        return "hola munndo!!";
    }

    @GetMapping(value = "/plandecuentas")
    public List<PlanDeCuentas> getPlanDeCuentas(){
        return todoRepository.findAll();
    }

    @PostMapping(value= "/saveplandecuentas")
    public String savePlanDeCuentas(@RequestBody PlanDeCuentas plan){
        todoRepository.save(plan);
        return "Plan de cuentas guardado";
    }

    @PutMapping(value="/updateplandecuentas/{id}")
    public String updatePlanDeCuentas(@PathVariable int id, @RequestBody PlanDeCuentas plan){
        PlanDeCuentas planActualizado = todoRepository.findById(id).get();
        planActualizado.setNroCuenta(plan.getNroCuenta());
        planActualizado.setDescripcion(plan.getDescripcion());
        planActualizado.setRubro(plan.getRubro());
        todoRepository.save(planActualizado);
        return "Plan de cuentas actualizado";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deletePlanDeCuentas(@PathVariable int id){
        PlanDeCuentas planBorrar = todoRepository.findById(id).get();
        todoRepository.delete(planBorrar);
        return "Plan de cuentas borrado";
    }




}
