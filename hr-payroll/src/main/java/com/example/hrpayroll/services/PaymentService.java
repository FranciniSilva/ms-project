package com.example.hrpayroll.services;

import com.example.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workedId, int days){
        return new Payment("Bob", 200.00, days);
    }
}
