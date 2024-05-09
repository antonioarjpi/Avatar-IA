package domains.repository;

import domains.models.ProfilePhoto;
import io.smallrye.mutiny.Uni;

public interface ProfilePhotoStorageRepository {
    Uni<String> store(String customerId, ProfilePhoto profilePhoto);
}
