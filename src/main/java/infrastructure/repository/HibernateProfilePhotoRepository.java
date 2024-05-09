package infrastructure.repository;

import domains.models.ProfilePhoto;
import domains.repository.ProfilePhotoPersistenceRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HibernateProfilePhotoRepository implements ProfilePhotoPersistenceRepository {
    @Override
    public void save(String customerId, ProfilePhoto profilePhoto) {

    }
}
