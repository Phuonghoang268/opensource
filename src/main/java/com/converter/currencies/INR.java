package com.converter.currencies;

import com.converter.ConvertableCurrency;
import com.converter.CurrencyType;

public class INR extends ConvertableCurrency {
    @Override
    protected String getCurrencyCode() {
        return "INR";
    }

    @Override
    public String getFullName() {
        return "Indonesian Rupiah";
    }

    @Override
    public CurrencyType getBaseCurrency() {
        return CurrencyType.IDR;
    }
}
