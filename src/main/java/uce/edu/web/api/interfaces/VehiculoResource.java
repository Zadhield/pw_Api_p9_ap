package uce.edu.web.api.interfaces;

import java.util.List;
import javax.print.attribute.standard.Media;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import uce.edu.web.api.application.VehiculoService;
import uce.edu.web.api.application.representation.VehiculoRepresentation;

@Path("/vehiculos")
@ApplicationScoped
public class VehiculoResource {
    @Inject
    private VehiculoService vehiculoService;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("admin")
    public List<VehiculoRepresentation> listarVehiculos() {
        return this.vehiculoService.listarTodos();
    }

    @POST
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("admin")
    public Response crearVehiculo(VehiculoRepresentation vehRep) {
        this.vehiculoService.crearVehiculo(vehRep);
        return Response.ok().build();
    }
}
