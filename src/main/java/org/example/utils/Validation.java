package org.example.utils;

import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidEmail(String email) {

        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    public static boolean isValidPhone(String phone) {

        return Pattern.matches("\\d{10}", phone);
    }
}


