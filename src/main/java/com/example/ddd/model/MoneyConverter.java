package com.example.ddd.model;

@Converter(autoApply = true)
public class MoneyConverter implements AttributeConverter<Money, Integer> {

    @Override
    public Y converterToDatabaseColumn(Money money) {
        return money == null ? null : money.getValue();
    }

    @Override
    public X convertToEntityAttribute(Integer value) {
        return value == null ? null : new Money(value);
    }
}

