package backend.course.spring.neobookshop.service;

import backend.course.spring.neobookshop.dto.request.ProductRequest;
import backend.course.spring.neobookshop.dto.response.ProductFullDescriptionResponse;
import backend.course.spring.neobookshop.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    String addProduct(ProductRequest productRequest);
    String updateProductById(Long productId);
    List<ProductResponse> getAllProducts();
    ProductFullDescriptionResponse getProductById(Long productId);
    String deleteProductById(Long id);
}
