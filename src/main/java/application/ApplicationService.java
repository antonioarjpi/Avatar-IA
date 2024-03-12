package application;

import application.dto.CustomerDTO;
import application.dto.ProfilePhotoDTO;
import domains.service.CustomerReadService;
import domains.service.ProfilePhotoCreateService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class ApplicationService {

    private final CustomerReadService customerReadService;
    private final ProfilePhotoCreateService profilePhotoCreateService;

    public ApplicationService(CustomerReadService customerReadService, ProfilePhotoCreateService profilePhotoCreateService) {
        this.customerReadService = customerReadService;
        this.profilePhotoCreateService = profilePhotoCreateService;
    }

    public List<CustomerDTO> listAllCustomers(){
        return customerReadService.findAll().stream().map(CustomerDTO::dtoFromDomain).toList();
    }

    public CustomerDTO getCustomer(String customerId){
        return CustomerDTO.dtoFromDomain(customerReadService.findById(customerId));
    }

    public void persistProfilePhoto(String customerId, ProfilePhotoDTO dto){
        profilePhotoCreateService.save(customerId, ProfilePhotoDTO.dtoFromDomain());
    }
}
