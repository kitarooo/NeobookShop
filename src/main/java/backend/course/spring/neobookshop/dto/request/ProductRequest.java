package backend.course.spring.neobookshop.dto.request;

import backend.course.spring.neobookshop.enums.Category;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequest {
    String productName;
    int count;
    String description;
    double price;
    Category category;
    String imageUrl;

}
