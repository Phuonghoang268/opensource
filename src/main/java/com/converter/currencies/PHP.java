package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class PHP extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "PHP";
    }

    @Override
    public String getFullName() {
        return "Philippine Peso";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.PHP;
    }
}
