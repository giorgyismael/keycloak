package br.com.gioliveira.resources;

import br.com.gioliveira.entity.Customer;
import br.com.gioliveira.service.CustomerService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("api/customer")
public class CustomerResource {

    @Inject
    CustomerService customerService;


    @GET
    @RolesAllowed("manager")
    public List<Customer> custumers(){
        List<Customer> customers = new ArrayList<>();
        try{
         customers =  customerService.findAllCustomers();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return customers;
    }


    @POST
    @RolesAllowed("manager")
    public void addCustomer(Customer customer){
        customerService.addCustumer(customer);
    }

}
