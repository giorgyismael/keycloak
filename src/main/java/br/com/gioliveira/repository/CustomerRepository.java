package br.com.gioliveira.repository;

import br.com.gioliveira.entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository  implements PanacheRepository<Customer> {

}
