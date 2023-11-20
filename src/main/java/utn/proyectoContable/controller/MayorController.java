package utn.proyectoContable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import utn.proyectoContable.model.LibroDiario;
import utn.proyectoContable.model.Mayor;
import utn.proyectoContable.servicio.MayorServicio;

@RestController
public class MayorController {

    @Autowired
    private MayorServicio servicio;

    @GetMapping(value = "/mayor")
    public String listarMayor(Model modelo){
        modelo.addAttribute("mayor",servicio.listarMayor());
        return "mayor"; //retorna al archivo plandecuentas
    }

    @PostMapping(value= "/mayor/nuevo")
    public String formCrearMayor(Model modelo){
        Mayor mayor = new Mayor();
        modelo.addAttribute("mayor", mayor);
        return "crear_v";
    }

    @PostMapping(value= "/mayor")
    public String guardarMayor(@ModelAttribute("mayor") Mayor mayor){
        servicio.guardarMayor(mayor);
        return "redirect:mayor";
    }

    @GetMapping(value = "/mayor/editar/{id}")
    public String formEditarMayor(@PathVariable int id, Model modelo){
        modelo.addAttribute("mayor", servicio.obtenerMayorPorId(id));
        return "editar_mayor";
    }

    @PostMapping(value="/mayor/{id}")
    public String actualizarMayor(@PathVariable int id, @ModelAttribute("librodiario") Mayor mayor, Model modelo){
        Mayor mayorExistente = servicio.obtenerMayorPorId(id);
        mayorExistente.setId(id);
        mayorExistente.setAnio(mayor.getAnio());
        mayorExistente.setNroCuenta(mayor.getNroCuenta());
        mayorExistente.setMes(mayor.getMes());
        mayorExistente.setSaldo(mayor.getSaldo());
        mayorExistente.setTotalDebe(mayor.getTotalDebe());
        mayorExistente.setTotalHaber(mayor.getTotalHaber());

        servicio.updateMayor(mayorExistente);
        return "redirect:/mayor";
    }

    @GetMapping(value = "/mayor/{id}")
    public String deleteMayor(@PathVariable int id){
        servicio.deleteMayor(id);
        return "redirect:/mayor";
    }
}
