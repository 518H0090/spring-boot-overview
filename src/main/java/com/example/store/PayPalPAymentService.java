package com.example.store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPAymentService implements  PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT");
        System.out.printf("Amount: %.2f%n", amount);
    }
}
