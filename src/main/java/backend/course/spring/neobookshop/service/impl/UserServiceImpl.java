package backend.course.spring.neobookshop.service.impl;

import backend.course.spring.neobookshop.dto.request.LoginRequest;
import backend.course.spring.neobookshop.dto.request.RegistrationRequest;
import backend.course.spring.neobookshop.dto.response.AuthenticationResponse;
import backend.course.spring.neobookshop.entity.User;
import backend.course.spring.neobookshop.enums.Role;
import backend.course.spring.neobookshop.execption.IncorrectDataException;
import backend.course.spring.neobookshop.execption.NotFoundException;
import backend.course.spring.neobookshop.execption.UserAlreadyExistException;
import backend.course.spring.neobookshop.repository.UserRepository;
import backend.course.spring.neobookshop.security.jwt.JwtService;
import backend.course.spring.neobookshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    @Override
    public String registration(RegistrationRequest registrationRequest) {
        if(userRepository.findUserByUsername(registrationRequest.getUsername()).isPresent()) {
            throw new UserAlreadyExistException("User with username: " + registrationRequest.getUsername() + " already exist!");
        }

        if (userRepository.findByEmail(registrationRequest.getEmail()).isPresent()) {
            throw new UserAlreadyExistException("User with email: " + registrationRequest.getEmail() + " already exist!");
        }

        User user = User.builder()
                .username(registrationRequest.getUsername())
                .email(registrationRequest.getEmail())
                .firstname(registrationRequest.getFirstname())
                .lastname(registrationRequest.getLastname())
                .role(Role.ROLE_ADMIN)
                .password(passwordEncoder.encode(registrationRequest.getPassword()))
                .build();
        userRepository.save(user);
        return "You was register!";
    }

    @Override
    public AuthenticationResponse login(LoginRequest loginRequest) {
        User user = userRepository.findUserByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new NotFoundException("User not found!"));

        if (passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            var jwtToken = jwtService.generateToken(user);
            return AuthenticationResponse.builder()
                    .accessToken(jwtToken)
                    .build();
        } else {
            throw new IncorrectDataException("Username or password incorrect!");
        }
    }
}
