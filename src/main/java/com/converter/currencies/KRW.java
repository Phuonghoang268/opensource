package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class KRW extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "KRW";
    }

    @Override
    public String getFullName() {
        return "South Korean Won";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.KRW;
    }
}
