package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class GBP extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "GBP";
    }

    @Override
    public String getFullName() {
        return "British Pound";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.GBP;
    }
}
