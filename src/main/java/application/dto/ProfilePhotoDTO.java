package application.dto;

import domains.models.ProfilePhoto;
import org.jboss.resteasy.reactive.multipart.FileUpload;

import java.util.UUID;

public record ProfilePhotoDTO(FileUpload fileUpload) {

    public static ProfilePhotoDTO create(FileUpload fileUpload) {
        return new ProfilePhotoDTO(fileUpload);
    }

    public static ProfilePhoto dtoFromDomain() {
        return new ProfilePhoto(UUID.randomUUID().toString(), null, null);
    }
}
