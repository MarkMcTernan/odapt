package io.datus.odapt.data.converters;

import java.util.List;

public class ListToStringConverter implements TypeConverter<String> {

    @Override
    public String convert(Object value) {
        return this.convert((List<String>) value, " ");
    }

    public String convert(List<?> list, String delimiter){
        StringBuilder bldr = new StringBuilder();

        list.forEach((e) -> {
            bldr.append(delimiter);
            bldr.append(e);
        });

        return bldr.toString().replaceFirst(delimiter, "");
    }
}