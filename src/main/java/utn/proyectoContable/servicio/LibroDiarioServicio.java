package utn.proyectoContable.servicio;

import utn.proyectoContable.model.LibroDiario;
import java.util.List;

public interface LibroDiarioServicio {
    public List<LibroDiario> listarLibroDiario();

    public LibroDiario guardarLibroDiario(LibroDiario libroDiario);

    public LibroDiario obtenerLibroDiarioPorId(Integer id);
    public LibroDiario updateLibroDiario(LibroDiario libroDiario);

    public void deleteLibroDiario(Integer id);
}
