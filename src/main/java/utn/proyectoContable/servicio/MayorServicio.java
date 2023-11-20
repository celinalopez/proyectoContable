package utn.proyectoContable.servicio;

import utn.proyectoContable.model.LibroDiario;
import utn.proyectoContable.model.Mayor;

import java.util.List;

public interface MayorServicio {

    public List<Mayor> listarMayor();

    public Mayor guardarMayor(Mayor mayor);

    public Mayor obtenerMayorPorId(Integer id);
    public Mayor updateMayor(Mayor mayor);

    public void deleteMayor(Integer id);
}
