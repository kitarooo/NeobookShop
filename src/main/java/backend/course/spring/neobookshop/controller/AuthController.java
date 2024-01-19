package backend.course.spring.neobookshop.controller;

import backend.course.spring.neobookshop.dto.request.LoginRequest;
import backend.course.spring.neobookshop.dto.request.RegistrationRequest;
import backend.course.spring.neobookshop.dto.response.AuthenticationResponse;
import backend.course.spring.neobookshop.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserServiceImpl service;

    @PostMapping("/register")
    public String registration(@RequestBody RegistrationRequest registrationRequest) {
        return service.registration(registrationRequest);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return service.login(loginRequest);
    }
}
