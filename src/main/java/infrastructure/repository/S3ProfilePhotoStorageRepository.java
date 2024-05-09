package infrastructure.repository;

import domains.models.ProfilePhoto;
import domains.repository.ProfilePhotoStorageRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class S3ProfilePhotoStorageRepository implements ProfilePhotoStorageRepository {

    @Override
    @Transactional
    public Uni<String> store(String customerId, ProfilePhoto profilePhoto) {
        return null;
    }
}
