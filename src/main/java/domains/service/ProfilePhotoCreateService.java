package domains.service;

import domains.models.ProfilePhoto;
import domains.repository.ProfilePhotoRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Map;

@ApplicationScoped
public class ProfilePhotoCreateService {

    private final ProfilePhotoRepository repository;

    public ProfilePhotoCreateService(ProfilePhotoRepository repository) {
        this.repository = repository;
    }

    public void save(String id, ProfilePhoto profilePhoto) {
        repository.registerEntities(Map.of(id, profilePhoto));
        repository.commit();
    }

}
