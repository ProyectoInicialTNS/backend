

package com.tns.backend;


import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("prueba")
public class Prueba {
    @GET
    @Path("/ja")
    public Response generarLista() {
        return Response.status(200).entity("puto").build();
    }
}