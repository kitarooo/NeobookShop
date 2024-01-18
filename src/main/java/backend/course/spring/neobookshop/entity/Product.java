package backend.course.spring.neobookshop.entity;

import backend.course.spring.neobookshop.enums.Category;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Entity
@Builder
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String productName;
    int count;
    String description;
    double price;
    Category category;
    String imageUrl;
}
