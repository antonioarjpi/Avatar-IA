package infrastructure.repository;

import domains.models.Customer;
import domains.models.ProfilePhoto;
import domains.repository.CustomerQuery;
import domains.repository.CustomerRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class HibernateCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> find(CustomerQuery customerQuery) {
        return List.of(new Customer(("customerId"),
                List.of(new ProfilePhoto("", "", " "))));
    }

    @Override
    public List<Customer> findAll() {
        return CustomerRepository.super.findAll();
    }

    @Override
    public Optional<Customer> findById(String id) {
        return CustomerRepository.super.findById(id);
    }
}
