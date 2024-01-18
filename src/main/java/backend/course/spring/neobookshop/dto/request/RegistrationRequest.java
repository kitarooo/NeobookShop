package backend.course.spring.neobookshop.dto.request;

import backend.course.spring.neobookshop.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegistrationRequest {
    String username;
    String email;
    String firstname;
    String lastname;
    String password;
    Role role;
}
