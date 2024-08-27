package com.project.thihetmon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Chèn đơn hàng
    public void insertOrders(List<Order> orders) {
        orderRepository.saveAll(orders);
    }

    // Sửa địa chỉ giao hàng
    public void updateDeliveryAddress(int orderid, String newAddress) {
        Order order = orderRepository.findByOrderid(orderid);
        if (order != null) {
            order.setDeliveryAddress(newAddress);
            orderRepository.save(order);
        }
    }

    // Xóa đơn hàng
    public void removeOrder(int orderid) {
        Order order = orderRepository.findByOrderid(orderid);
        if (order != null) {
            orderRepository.delete(order);
        }
    }

    // Đọc tất cả đơn hàng
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Tính tổng số lượng sản phẩm "somi"
    public long countProductByProductId(String productId) {
        return orderRepository.findAll().stream()
                .flatMap(order -> order.getProducts().stream())
                .filter(product -> product.getProductId().equals(productId))
                .count();
    }
}
