package com.registration;

public class UserRegistration {
    public static void main(String[] args) {
        Validation validation = new Validation();
        validation.checkFirstName();
        validation.checkLastName();
        validation.checkEmail();
        validation.checkPhoneNumber();
        validation.checkPasswordRule1();
        validation.checkPasswordRule2();
        validation.checkPasswordRule3();
        validation.checkPasswordRule4();
        validation.checkEmail2();
    }
}
