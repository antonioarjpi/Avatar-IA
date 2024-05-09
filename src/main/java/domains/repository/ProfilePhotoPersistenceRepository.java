package domains.repository;

import domains.models.ProfilePhoto;

public interface ProfilePhotoPersistenceRepository {
    void save(String customerId, ProfilePhoto profilePhoto);
}
