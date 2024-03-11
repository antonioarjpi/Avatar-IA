package domains.repository;

import domains.models.Customer;
import domains.models.ProfilePhoto;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> find(CustomerQuery customerQuery);

    default List<Customer> findAll(){
        return find(new CustomerQuery.Builder().build());
    }

    default Optional<Customer> findById(String id){
        return find(new CustomerQuery.Builder().withId(id).build()).stream().findFirst();
    }
}