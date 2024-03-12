package application.dto;

import domains.models.Customer;
import domains.models.ProfilePhoto;

import java.util.List;

public record CustomerDTO(String customerId, List<String> photos) {

    public static CustomerDTO dtoFromDomain(Customer dto) {
        return new CustomerDTO(dto.id(),
                dto.profilePhotos().stream().map(ProfilePhoto::generatePhoto).toList());
    }
}
