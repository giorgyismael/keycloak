package br.com.gioliveira.service;

import br.com.gioliveira.entity.Customer;
import br.com.gioliveira.repository.CustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository  customerRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll().list();
    }

    @Transactional
    public void addCustumer(Customer customer){
        customerRepository.persist(customer);
    }

}
