package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Shorya","Rastogi");
        CredentialService credentialService =new CredentialService();

        String generatedEmail;
        char [] generatedPassword;

        System.out.println("Please Enter the Department from the following : ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option){
            case 1 : {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
                generatedPassword=credentialService.generatePassword();
                credentialService.showCredentials(employee,generatedEmail,generatedPassword);
                break;
            }
            case 2 : {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"adm");
                generatedPassword=credentialService.generatePassword();
                credentialService.showCredentials(employee,generatedEmail,generatedPassword);
                break;
            }
            case 3 : {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
                generatedPassword=credentialService.generatePassword();
                credentialService.showCredentials(employee,generatedEmail,generatedPassword);
                break;
            }
            case 4 : {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"lg");
                generatedPassword=credentialService.generatePassword();
                credentialService.showCredentials(employee,generatedEmail,generatedPassword);
                break;
            }
            default: {
                System.out.println("Wrong Option Entered");
                break;
            }
        }
    }
}
