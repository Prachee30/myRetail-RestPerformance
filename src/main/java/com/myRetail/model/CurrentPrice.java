package com.myRetail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CurrentPrice")
public class CurrentPrice {

    @Id
    private int currentPriceId;
    private Double value;
    private String currencyCode;

    public int getCurrentPriceId() {
        return currentPriceId;
    }

    public void setCurrentPriceId(int currentPriceId) {
        this.currentPriceId = currentPriceId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
