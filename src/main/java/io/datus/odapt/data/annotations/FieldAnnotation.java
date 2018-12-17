package io.datus.odapt.data.annotations;

import io.datus.odapt.data.converters.TypeConverter;
import io.datus.odapt.data.converters.ObjectConverter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.FIELD, ElementType.METHOD} )
public @interface FieldAnnotation {
    String match();
    Class<? extends TypeConverter> converter() default ObjectConverter.class;
}
