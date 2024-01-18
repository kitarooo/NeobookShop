package backend.course.spring.neobookshop.service;

public interface ProductRepository {
    String addProduct(ProductRequest productRequest);
    String updateProductById(Long productId);
    List<ProductsResponse> getAllProducts();
    ProductFullDescriptionResponse getProductById(Long productId);
    void deleteProductById(Long id);
}
