package io.datus.odapt.data.converters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToListConverter implements TypeConverter<List<String>> {

    @Override
    public List<String> convert(Object value){
        return this.convert(value.toString(), " ");
    }

    public List<String> convert(String value, String delimiter){
        return Arrays.stream(value.split(delimiter)).collect(Collectors.toList());
    }
}