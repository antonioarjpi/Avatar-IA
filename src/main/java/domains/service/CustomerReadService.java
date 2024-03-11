package domains.service;

import domains.models.Customer;
import domains.repository.CustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CustomerReadService {

    public final CustomerRepository repository;

    public CustomerReadService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> findAll(){
        return repository.findAll();
    }

    public Customer findById(String id){
        return repository.findById(id).orElseThrow(NoClassDefFoundError::new);
    }
}
