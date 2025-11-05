package auth;

import br.edu.atitus.auth_service.entities.UserEntity;

public record SigninResponseDTO(UserEntity user, String token) {

}
