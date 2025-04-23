package com.alumno.cl.alumno.AlumnoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class AlumnoController {
    
    @GetMapping("api/v1/alumnos")
    public String getAlumno() {
        return "LISTADO ALUMNO";
    }
    
    @GetMapping("api/v1/alumno/{id}")
    public String getAlumno(@PathVariable("id") int id) {
        return "DETALLE ALUMNO " + id;
}
}
