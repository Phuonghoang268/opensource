package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class USD extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "USD";
    }

    @Override
    public String getFullName() {
        return "US Dollar";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.USD;
    }
}
