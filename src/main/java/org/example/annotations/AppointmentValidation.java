package org.example.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AppointmentValidation {
    String[] requiredFields();
}
