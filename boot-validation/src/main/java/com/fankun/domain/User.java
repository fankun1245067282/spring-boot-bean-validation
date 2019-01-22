package com.fankun.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class User {
    @Max(value=1000)
    private Long id;
    @NotNull
    private String name;

    private String cardNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
