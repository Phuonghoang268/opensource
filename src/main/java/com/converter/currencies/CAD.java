package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class CAD extends ConvertableCurrency {

    @Override
    protected String getCurrencyCode() {
        return "CAD";
    }

    @Override
    public String getFullName() {
        return "Canadian Dollar";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.CAD;
    }
}
