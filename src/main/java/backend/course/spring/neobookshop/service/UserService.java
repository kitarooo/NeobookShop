package backend.course.spring.neobookshop.service;

public interface UserRepository {
    String registration(RegistrationDto registrationDto);
    String login(LoginRequest loginRequest);
}
