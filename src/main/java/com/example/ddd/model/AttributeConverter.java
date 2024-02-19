package com.example.ddd.model;

public interface AttributeConverter {
    public Y converterToDatabaseColumn(X attribute);
    public X convertToEntityAttribute(Y dbData);
}
