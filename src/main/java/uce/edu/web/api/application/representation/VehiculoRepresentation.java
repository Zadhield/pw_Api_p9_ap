package uce.edu.web.api.application.representation;

import java.time.LocalDate;

public class VehiculoRepresentation {
    private String marca;
    private String modelo;
    private String chasis;
    private LocalDate fechaFabricacion;
    private LocalDate fechaMatricula;
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getChasis() {
        return chasis;
    }
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }
    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

}
