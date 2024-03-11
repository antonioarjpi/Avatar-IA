package domains.repository;

import domains.models.ProfilePhoto;

public interface ProfilePhotoRepository {
    void save(String customerId, ProfilePhoto profilePhoto);
}
