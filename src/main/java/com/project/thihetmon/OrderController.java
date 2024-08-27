package com.project.thihetmon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/insert")
    public void insertOrders(@RequestBody List<Order> orders) {
        orderService.insertOrders(orders);
    }

    @PutMapping("/update-address/{orderid}")
    public void updateDeliveryAddress(@PathVariable int orderid, @RequestBody String newAddress) {
        orderService.updateDeliveryAddress(orderid, newAddress);
    }

    @DeleteMapping("/remove/{orderid}")
    public void removeOrder(@PathVariable int orderid) {
        orderService.removeOrder(orderid);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/count/{productId}")
    public long countProductByProductId(@PathVariable String productId) {
        return orderService.countProductByProductId(productId);
    }
}
