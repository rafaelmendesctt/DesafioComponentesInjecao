package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double result = 0;
        if (order.getBasic() <= 100) {
            result = 20;
        } else if (order.getBasic() <= 200) {
            result = 12;
        }
        return result;
    }
}
