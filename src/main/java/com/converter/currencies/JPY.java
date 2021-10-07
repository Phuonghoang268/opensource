package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class JPY extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "JPY";
    }

    @Override
    public String getFullName() {
        return "Japanese Yen";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.JPY;
    }
}
