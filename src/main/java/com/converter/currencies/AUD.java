package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class AUD extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "AUD";
    }

    @Override
    public String getFullName() {
        return "Australian Dollar";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.AUD;
    }
}
