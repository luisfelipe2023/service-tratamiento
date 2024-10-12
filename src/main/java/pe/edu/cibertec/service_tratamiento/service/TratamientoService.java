package pe.edu.cibertec.service_tratamiento.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.service_tratamiento.model.Tratamiento;

import java.util.ArrayList;
import java.util.List;

@Service
public class TratamientoService {
    private List<Tratamiento> tratamientos = new ArrayList<>();

    public TratamientoService() {
        // Inicializar con algunos tratamientos de ejemplo
        tratamientos.add(new Tratamiento(1, "Consulta médica"));
        tratamientos.add(new Tratamiento(2, "Examen de sangre"));
        tratamientos.add(new Tratamiento(3, "Radiografía"));
        tratamientos.add(new Tratamiento(4, "Tratamiento de fisioterapia"));
        tratamientos.add(new Tratamiento(5, "Vacunación"));
    }

    public Tratamiento agregarTratamiento(String descripcion) {
        int nuevoId = tratamientos.size() + 1;
        Tratamiento nuevoTratamiento = new Tratamiento(nuevoId, descripcion);
        tratamientos.add(nuevoTratamiento);
        return nuevoTratamiento;
    }
    public List<Tratamiento> obtenerTratamientos() {
        return tratamientos;
    }
    public Tratamiento obtenerTratamientoPorId(int id) {
        for (Tratamiento tratamiento : tratamientos) {
            if (tratamiento.getId() == id) {
                return tratamiento;
            }
        }
        return null;
    }
    public boolean eliminarTratamiento(int id) {
        Tratamiento tratamiento = obtenerTratamientoPorId(id);
        if (tratamiento != null) {
            tratamientos.remove(tratamiento);
            return true; // Eliminado exitosamente
        }
        return false; // No encontrado
    }
}
