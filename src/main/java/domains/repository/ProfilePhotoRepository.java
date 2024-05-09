package domains.repository;

import domains.models.ProfilePhoto;
import io.smallrye.mutiny.Uni;

import java.util.Map;

public interface ProfilePhotoRepository {
    void registerEntities(Map<String, ProfilePhoto> entities);
    void commit();
    void rollback();
}
