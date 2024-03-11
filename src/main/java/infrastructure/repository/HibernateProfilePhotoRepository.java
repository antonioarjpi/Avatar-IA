package infrastructure.repository;

import domains.models.ProfilePhoto;
import domains.repository.ProfilePhotoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HibernateProfilePhotoRepository implements ProfilePhotoRepository {
    @Override
    public void save(String customerId, ProfilePhoto profilePhoto) {

    }
}
