package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class UNIVERSAL_CURRENCY extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "";
    }

    @Override
    public String getFullName() {
        return "";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
