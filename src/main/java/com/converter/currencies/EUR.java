package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class EUR extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "EUR";
    }

    @Override
    public String getFullName() {
        return "Euro";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.EUR;
    }
}
