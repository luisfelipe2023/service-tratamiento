package pe.edu.cibertec.service_tratamiento.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.service_tratamiento.model.Tratamiento;
import pe.edu.cibertec.service_tratamiento.service.TratamientoService;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class TratamientoController {
    private final TratamientoService tratamientoService;

    @GetMapping("/{id}/descripcion")
    public ResponseEntity<String> descripcionTratamiento(@PathVariable int id) {
        Tratamiento tratamiento = tratamientoService.obtenerTratamientoPorId(id);
        if (tratamiento != null) {
            return new ResponseEntity<>("Descripción del tratamiento: " + tratamiento.getDescripcion(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Tratamiento no encontrado", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/tratamiento")
    public String obtenerListaDeTratamiento(){
        return "Lista de Tratamientos Obteneida";
    }


    @GetMapping("/")
    public ResponseEntity<List<Tratamiento>> obtenerListaDeTratamientos() {
        List<Tratamiento> tratamientos = tratamientoService.obtenerTratamientos();
        return new ResponseEntity<>(tratamientos, HttpStatus.OK);
    }



    @GetMapping("/tratamiento/descripcion")
    public String descripcionTratamiento() {
        return "Descripción del tratamiento.";
    }

    @GetMapping("/tratamiento/disponibilidad")
    public String disponibilidadTratamiento() {
        return "Disponibilidad de tratamientos.";
    }
    @GetMapping("/disponibilidad")
    public ResponseEntity<String> disponibilidadTratamientos() {
        return new ResponseEntity<>("Disponibilidad de tratamientos: Todos los tratamientos están disponibles.", HttpStatus.OK);
    }

}
