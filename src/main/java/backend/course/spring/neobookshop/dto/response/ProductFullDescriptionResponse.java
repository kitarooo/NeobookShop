package backend.course.spring.neobookshop.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductFullDescriptionResponse {
    String productName;
    String description;
    String imageUrl;
    int count;
}
