package com.training.resources;



import com.training.dao.MedicineDao;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

@Path("/medicine")
public class MedicineResource {

    private MedicineDao dao;

    public MedicineResource() throws SQLException, ClassNotFoundException {
        dao = new MedicineDao();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMedicine(){

        Medicine crocin = new Medicine(113,"CroconTab",344);

        return Response.status(200).entity(crocin).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addMedicine(Medicine medicine) throws SQLException {

        int rowAdded = dao.add(medicine);

        Response resp = Response.status(200).entity("Record Not Added").build();

        if(rowAdded == 1){
           resp=  Response.status(201).entity(medicine).build();
        }
        return resp;

    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeMedicine(Medicine medicine) throws SQLException {

        int rowDeleted = dao.remove(medicine.getCode());

        Response resp = Response.status(200).entity("Record Not Deleted").build();

        if(rowDeleted == 1){
            resp=  Response.status(204).entity(medicine).build();
        }
        return resp;

    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateMedicine(Medicine medicine) throws SQLException {

        int rowUpdated = dao.update(medicine);

        Response resp = Response.status(204).entity("Record Not Updated").build();

        if(rowUpdated == 1){
            resp=  Response.status(200).entity(medicine).build();
        }
        return resp;

    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMedicines() {
        Response resp = Response.status(200).entity("Record Not Removed").build();
        List<Medicine> medicines = dao.findAll();
        if (medicines.size() != 0) {
            resp = Response.status(200).entity(medicines).build();
        }
        return resp;
    }


    @GET
    @Path("/srch/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long key) {
        Response resp = Response.status(200).entity("Record Not Found").build();
        Medicine medicine = dao.findById(key);
        if (medicine != null) {
            resp = Response.status(200).entity(medicine).build();
        }
        return resp;
    }

}
