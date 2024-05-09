package infrastructure.repository;

import domains.models.ProfilePhoto;
import domains.repository.ProfilePhotoRepository;
import jakarta.enterprise.context.RequestScoped;

import java.util.Map;
import java.util.logging.Logger;

@RequestScoped
public class UnitOfWorkProfilePhotoRepository implements ProfilePhotoRepository {

    private final HibernateProfilePhotoRepository profilePhotoRepository;
    private final S3ProfilePhotoStorageRepository photoStorageRepository;
    private Map<String, ProfilePhoto> entities;

    public UnitOfWorkProfilePhotoRepository(HibernateProfilePhotoRepository profilePhotoRepository,
                                            S3ProfilePhotoStorageRepository photoStorageRepository) {
        this.profilePhotoRepository = profilePhotoRepository;
        this.photoStorageRepository = photoStorageRepository;
        this.entities = Map.of();
    }

    @Override
    public void registerEntities(Map<String, ProfilePhoto> entities) {

    }

    @Override
    public void commit() {
        entities.forEach((customerId, profilePhoto) -> {
            try {
                profilePhotoRepository.save(customerId, profilePhoto);

                var url = photoStorageRepository.store(customerId, profilePhoto).await().indefinitely();
                var updated = new ProfilePhoto(profilePhoto.id(), url, profilePhoto.generatePhoto());

                profilePhotoRepository.save(customerId, updated);
            } catch (Exception e) {
                Logger.getLogger(e.getMessage());
            }
        });


    }

    @Override
    public void rollback() {

    }
}
