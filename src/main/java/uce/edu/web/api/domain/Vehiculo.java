package uce.edu.web.api.domain;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculos")
@SequenceGenerator(name = "vehiculo_sec", sequenceName = "vehiculo_secuencia", allocationSize = 1)
public class Vehiculo extends PanacheEntityBase{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehiculo_sec")
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
