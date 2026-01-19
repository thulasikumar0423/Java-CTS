package org.test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.OrderService;
import org.example.PaymentService;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    @Test
    void testOrderSuccess() {
        PaymentService paymentService = mock(PaymentService.class);

        when(paymentService.processPayment(100.0)).thenReturn(true);

        OrderService orderService = new OrderService(paymentService);

        assertTrue(orderService.placeOrder(100.0));
    }
}
