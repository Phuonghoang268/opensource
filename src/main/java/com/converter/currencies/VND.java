package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class VND extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "VND";
    }

    @Override
    public String getFullName() {
        return "Vietnam Dong";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.VND;
    }
}
