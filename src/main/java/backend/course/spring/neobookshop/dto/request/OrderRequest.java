package backend.course.spring.neobookshop.dto.request;

import backend.course.spring.neobookshop.entity.Product;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {
    String orderName;
    String phoneNumber;
    String address;
    String comment;
    int totalPrice;
    List<Product> products;
}
