package com.problems.zoho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PassportValidator {

    public static String validatePassport(String passport) {

        if (passport.length() < 10) {
            return "Invalid";
        }

        // check the empty space
        if (passport.contains(" ")) {
            return "Invalid";
        }

        // Nationality Checks
        String[] validNationalities = {"USA", "IND", "CAN", "GBR"};
        String nationality = passport.substring(0, 3);
        boolean validNationality = false;

        for (String validNation : validNationalities) {
            if (validNation.equals(nationality)) {
                validNationality = true;
                break;
            }
        }
        if (!validNationality) {
            return "Invalid";
        }

        // check the passport number
        String passportNumber = passport.substring(3, 12);
        if (!passportNumber.matches("\\d{9}")) {
            return "Invalid";
        }

        // check the expiry date
        String expirationDate = passport.substring(12, 22);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // if date is not format like month is above 12 it will throw the exception so here we
        // are using try and catch
        try {
            LocalDate expiry = LocalDate.parse(expirationDate, dateFormat);
            if (expiry.isBefore(LocalDate.now())) {
                return "Invalid";
            }
        } catch (DateTimeParseException ex) {
            return "Invalid";
        }

        // special char check
        String specialCharacters = "!@#$%^&*()-_+=~";
        boolean containsSpecialChar = false;

        for (char c : passport.toCharArray()) {
            if (specialCharacters.contains(Character.toString(c))) {
                containsSpecialChar = true;
                break;
            }
        }

        if (!containsSpecialChar) {
            return "Invalid";
        }

        // check the authority
        // if this all will false the ! negate will oppose it covert into true
        if (!(passport.contains("GOV") || passport.contains("EMB") || passport.contains("CONS"))) {
            return "Invalid";
        }

        return "Valid";

    }

    public static void main(String[] args) {

        System.out.println(validatePassport("USA1234567892025-12-31!GOV"));
        System.out.println(validatePassport("CAN9876543212022-05-15CONS"));
        System.out.println(validatePassport("IND9871234562024-10-10@"));

    }
}
