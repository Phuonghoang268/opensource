package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class COP extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "COD";
    }

    @Override
    public String getFullName() {
        return "Colombian Peso";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.COP;
    }
}
