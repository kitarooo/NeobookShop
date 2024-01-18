package backend.course.spring.neobookshop.service;

import backend.course.spring.neobookshop.dto.request.LoginRequest;
import backend.course.spring.neobookshop.dto.request.RegistrationRequest;
import backend.course.spring.neobookshop.dto.response.AuthenticationResponse;

public interface UserService {
    String registration(RegistrationRequest registrationRequest);
    AuthenticationResponse login(LoginRequest loginRequest);
}
