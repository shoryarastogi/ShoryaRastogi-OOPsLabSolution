package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {
    public char[] generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialLetters = "!@#$%^&*()-_+-*/?><";

        String value = capitalLetters + smallLetters + numbers + specialLetters;

        Random random = new Random();
        char[] password = new char[8];
        for (int i = 0; i < 8; i++) {
            password[i] = value.charAt(random.nextInt(value.length()));
        }
        return password;
    }

    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName + lastName + "@" + department + "abc.com";
    }

    public void showCredentials(Employee employee, String email, char[] password) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows :");
        System.out.println("Email --> " + email);
        String m_password = new String(password);
        System.out.println("Password -->" + m_password);
    }
}
