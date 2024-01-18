package backend.course.spring.neobookshop.service;

import backend.course.spring.neobookshop.dto.request.OrderRequest;
import backend.course.spring.neobookshop.dto.response.OrderFullResponse;
import backend.course.spring.neobookshop.dto.response.OrderResponse;

import java.util.List;

public interface OrderService {
    String createOrder(OrderRequest orderRequest);
    List<OrderResponse> getAllOrders();
    OrderFullResponse getOrderById(Long orderId);
}
