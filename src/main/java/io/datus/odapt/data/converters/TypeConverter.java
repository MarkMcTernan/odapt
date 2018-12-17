package io.datus.odapt.data.converters;

/**
 * @param <T> Sets the return type for the convert command
 */
public interface TypeConverter<T> {
    T convert(Object value);
}