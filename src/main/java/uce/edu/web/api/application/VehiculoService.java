package uce.edu.web.api.application;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import uce.edu.web.api.application.representation.VehiculoRepresentation;
import uce.edu.web.api.domain.Vehiculo;
import uce.edu.web.api.infraestructure.VehiculoRepository;

@ApplicationScoped
public class VehiculoService {
   @Inject
   private  VehiculoRepository vehiculoRepository;
   
   public List<VehiculoRepresentation> listarTodos(){
    return vehiculoRepository.findAll().stream().map(this::mapperToRe).toList();
   }

   @Transactional
   public void crearVehiculo(VehiculoRepresentation vehRep){
    this.vehiculoRepository.persist(mapperToDomain(vehRep));
   }


   public VehiculoRepresentation mapperToRe (Vehiculo veh){
     VehiculoRepresentation vehRep= new VehiculoRepresentation();
        vehRep.setMarca(veh.getMarca());   
        vehRep.setModelo(veh.getModelo());
        vehRep.setChasis(veh.getChasis());
        vehRep.setFechaFabricacion(veh.getFechaFabricacion());
        vehRep.setFechaMatricula(veh.getFechaMatricula());
        return vehRep; 
   }
   public Vehiculo mapperToDomain (VehiculoRepresentation vehRep){
    Vehiculo veh= new Vehiculo();
    veh.setMarca(vehRep.getMarca());   
    veh.setModelo(vehRep.getModelo());
    veh.setChasis(vehRep.getChasis());
    veh.setFechaFabricacion(vehRep.getFechaFabricacion());
    veh.setFechaMatricula(vehRep.getFechaMatricula());
    return veh; 
   }
}
