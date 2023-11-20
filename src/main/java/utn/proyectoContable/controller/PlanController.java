package utn.proyectoContable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import utn.proyectoContable.model.PlanDeCuentas;
import utn.proyectoContable.servicio.PlanServicio;

import java.util.List;

@RestController
public class PlanController {
    @Autowired
    private PlanServicio servicio;

    @GetMapping(value= "/")
    public String holaMundo(){
        return "hola munndo!!";
    }

    @GetMapping(value = "/plandecuentas")
    public String listarPlanDeCuentas(Model modelo){
        modelo.addAttribute("plandecuentas",servicio.listarPlanDeCuentas());
        return "plandecuentas"; //retorna al archivo plandecuentas
    }

    @PostMapping(value= "/plandecuentas/nuevo")
    public String formCrearPlanDeCuentas(Model modelo){
        PlanDeCuentas nuevoPlan = new PlanDeCuentas();
        modelo.addAttribute("plandecuentas", nuevoPlan);
        return "crear_plandecuentas";
    }

    @PostMapping(value= "/plandecuentas")
    public String guardarPlanDeCuentas(@ModelAttribute("plandecuentas") PlanDeCuentas planDeCuentas){
        servicio.guardarPlanDeCuentas(planDeCuentas);
        return "redirect:plandecuentas";
    }

    @GetMapping(value = "/estudiantes/editar/{id}")
    public String formEditarPlanDeCuentas(@PathVariable int id, Model modelo){
        modelo.addAttribute("plandecuentas", servicio.obtenerPlanDeCuentasPorId(id));
        return "editar_plandecuentas";
    }

    @PostMapping(value="/plandecuentas/{id}")
    public String actualizarPlanDeCuentas(@PathVariable int id, @ModelAttribute("plandecuentas") PlanDeCuentas plandecuentas, Model modelo){
        PlanDeCuentas planExistente = servicio.obtenerPlanDeCuentasPorId(id);
        planExistente.setId(id);
        planExistente.setRubro(plandecuentas.getRubro());
        planExistente.setDescripcion(plandecuentas.getDescripcion());
        planExistente.setNroCuenta(plandecuentas.getNroCuenta());
        servicio.updatePlanDeCuentas(planExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping(value = "/plandecuentas/{id}")
    public String deletePlanDeCuentas(@PathVariable int id){
        servicio.deletePlanDeCuentas(id);
        return "redirect:/estudiantes";
    }




}
