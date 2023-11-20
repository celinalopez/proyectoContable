package utn.proyectoContable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import utn.proyectoContable.model.LibroDiario;
import utn.proyectoContable.model.PlanDeCuentas;
import utn.proyectoContable.servicio.LibroDiarioServicio;

@RestController
public class LibroDiarioController {

    @Autowired
    private LibroDiarioServicio servicio;

    @GetMapping(value= "/")
    public String holaMundo(){
        return "hola munndo!!";
    }

    @GetMapping(value = "/librodiario")
    public String listarLibroDiario(Model modelo){
        modelo.addAttribute("plandecuentas",servicio.listarLibroDiario());
        return "plandecuentas"; //retorna al archivo plandecuentas
    }

    @PostMapping(value= "/librodiario/nuevo")
    public String formCrearLibroDiario(Model modelo){
        LibroDiario libroDiario = new LibroDiario();
        modelo.addAttribute("librodiario", libroDiario);
        return "crear_librodiario";
    }

    @PostMapping(value= "/librodiario")
    public String guardarLibroDiario(@ModelAttribute("librodiario") LibroDiario libroDiario){
        servicio.guardarLibroDiario(libroDiario);
        return "redirect:librodiario";
    }

    @GetMapping(value = "/librodiario/editar/{id}")
    public String formEditarLibroDiario(@PathVariable int id, Model modelo){
        modelo.addAttribute("librodiario", servicio.obtenerLibroDiarioPorId(id));
        return "editar_librodiario";
    }

    @PostMapping(value="/librodiario/{id}")
    public String actualizarLibroDiario(@PathVariable int id, @ModelAttribute("librodiario") LibroDiario libroDiario, Model modelo){
        LibroDiario libroexistente = servicio.obtenerLibroDiarioPorId(id);
        libroexistente.setId(id);
        libroexistente.setNroCuenta(libroDiario.getNroCuenta());
        libroexistente.setDebe(libroDiario.getDebe());
        libroexistente.setFecha(libroDiario.getFecha());
        libroexistente.setHaber(libroDiario.getHaber());
        libroexistente.setNroAsiento(libroDiario.getNroAsiento());
        servicio.updateLibroDiario(libroexistente);
        return "redirect:/librodiario";
    }

    @GetMapping(value = "/librodiario/{id}")
    public String deletePlanDeCuentas(@PathVariable int id){
        servicio.deleteLibroDiario(id);
        return "redirect:/librodiario";
    }
}
