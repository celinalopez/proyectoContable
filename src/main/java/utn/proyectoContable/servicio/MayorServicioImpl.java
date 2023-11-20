package utn.proyectoContable.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.proyectoContable.model.Mayor;
import utn.proyectoContable.repository.MayorRepository;

import java.util.List;

@Service
public class MayorServicioImpl implements MayorServicio {

    @Autowired
    private MayorRepository repository;
    @Override
    public List<Mayor> listarMayor() {
        return repository.findAll();
    }

    @Override
    public Mayor guardarMayor(Mayor mayor) {
        return repository.save(mayor);
    }

    @Override
    public Mayor obtenerMayorPorId(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Mayor updateMayor(Mayor mayor) {
        return repository.save(mayor);
    }

    @Override
    public void deleteMayor(Integer id) {
        repository.deleteById(id);
    }
}
