package com.training.ifaces;

import com.training.beans.Director;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
//@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MovieService {

    @WebMethod(operationName = "getRating")
    public double getRating(@WebParam(name = "movieName") String movieName);

    public Director getTopDirector(@WebParam(name="movieType") String movieType);

}
