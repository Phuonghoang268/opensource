package com.converter;

public class Converter {

    public static Double convert(Double amountOfBaseCurrency,
                                 ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }

}
