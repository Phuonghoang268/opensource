package com.converter;

public abstract class ConvertableCurrency {

    public Double convert(CurrencyType currencyType) {
        CurrencyType baseCurrency = getBaseCurrency();
        return currencyType.getRate() / baseCurrency.getRate();
    }

    public String getLabel() {
        return getFullName();
    }

    protected abstract String getCurrencyCode();

    protected abstract String getFullName();

    protected abstract CurrencyType getBaseCurrency();
}
