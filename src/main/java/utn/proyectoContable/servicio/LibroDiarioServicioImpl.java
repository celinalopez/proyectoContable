package utn.proyectoContable.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.proyectoContable.model.LibroDiario;
import utn.proyectoContable.repository.LibroDiarioRepository;

import java.util.List;

@Service
public class LibroDiarioServicioImpl implements LibroDiarioServicio{

    @Autowired
    private LibroDiarioRepository repository;
    @Override
    public List<LibroDiario> listarLibroDiario() {
        return repository.findAll();
    }

    @Override
    public LibroDiario guardarLibroDiario(LibroDiario libroDiario) {
        return repository.save(libroDiario);
    }

    @Override
    public LibroDiario obtenerLibroDiarioPorId(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public LibroDiario updateLibroDiario(LibroDiario libroDiario) {
        return repository.save(libroDiario);
    }

    @Override
    public void deleteLibroDiario(Integer id) {
        repository.deleteById(id);
    }
}
