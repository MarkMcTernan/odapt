package io.datus.odapt.data.converters;

public class ObjectConverter implements TypeConverter<Object> {
    @Override
    public Object convert(Object value) {
        return value;
    }
}