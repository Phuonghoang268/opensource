package com.converter;

public enum CurrencyType {
    AUD(1.37), // Australian Dollar
    CAD(1.26), // Canadian Dollar
    COP(3787.21), // Colombian Peso
    EUR(0.86), // Euros
    GBP(0.73), // British Pound
    IDR(14247.89), // Indonesian Rupiah
    INR(74.74), // Indian Rupee
    JPY(111.39), // Japanese Yen,
    KRW(1189.84), // South Korean Won,
    PHP(50.81), // Philippine Peso,
    USD(1.0), // US Dollar
    VND(22630.0), // Vietnam Dong,
    UNIVERSAL_CURRENCY(1.0);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        return currency.getBaseCurrency();
    }
}
