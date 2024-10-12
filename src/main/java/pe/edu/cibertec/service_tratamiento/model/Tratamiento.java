package pe.edu.cibertec.service_tratamiento.model;

public class Tratamiento {
    private int id;
    private String descripcion;


    public Tratamiento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
