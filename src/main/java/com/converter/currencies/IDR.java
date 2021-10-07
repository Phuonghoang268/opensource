package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class IDR extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "IDR";
    }

    @Override
    public String getFullName() {
        return "Indian Rupee";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.INR;
    }
}
