package com.example.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Payment {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal(){
        return this.days * this.dailyIncome;
    }
}
