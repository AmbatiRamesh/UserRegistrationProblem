package com.registration;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validation {
    Scanner scanner = new Scanner(System.in);
    public void checkFirstName() {
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", firstName)) {
            System.out.println("First Name is Valid---!!");
        } else {
            System.out.println("First Name is Invalid--!!");
        }
    }
    public void checkLastName() {
        System.out.println("-----------------");
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName)) {
            System.out.println("LastName is Valid---!!");
        } else {
            System.out.println("LastName is Invalid--!!");
        }
    }
    public void checkEmail() {
        System.out.println("-----------------");
        System.out.println("Enter Email : ");
        String email = scanner.next();
        if (Pattern.matches("^[a-zA-Z]{3,}[.]?[A-za-z0-9]{3,}[.]?[a-zA-Z]+[@]{1}[a-z]+[.]?[a-z]*", email)) {
            System.out.println("Email is Valid---!!");
        } else {
            System.out.println("Email is Invalid--!!");
        }
    }
    public void checkPhoneNumber() {
        System.out.println("-----------------");
        System.out.println("Enter PhoneNumber : ");
        String phoneNumber  = scanner.next();
        if (Pattern.matches("^[0-9]+\s[0-9]{10}", phoneNumber)) {
            System.out.println("PhoneNumber is Valid---!!");
        } else {
            System.out.println("PhoneNumber is Invalid--!!");
        }
    }
    public void checkPasswordRule1() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password  = scanner.next();
        if (Pattern.matches("^[a-zA-z]{8,}", password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
        }
    }
    public void checkPasswordRule2() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password = scanner.next();
        if (Pattern.matches("^[A-z]+[A-Za-z]{8,}", password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
        }
    }
    public void checkPasswordRule3() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password  = scanner.next();
        if (Pattern.matches("^[A-Z0-9]+[A-Za-z0-9]{8,}", password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
        }
    }
    public void checkPasswordRule4() {
        System.out.println("-----------------");
        System.out.println("Enter Password : ");
        String password  = scanner.next();
        if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+", password)) {
            System.out.println("Password is Valid---!!");
        } else {
            System.out.println("Password is Invalid--!!");
        }
    }
    public void checkEmail2() {
        System.out.println("-----------------");
        System.out.println("Enter Email Id: ");
        String email = scanner.next();
        if (Pattern.matches("^[a-zA-Z]{3,}[+-.]?[A-za-z0-9]*[@]{1}[a-z]+[.]?[a-z]*[.]?[a-z]", email)) {
            System.out.println("Email is Valid---!!");
            checkEmail2();
        } else {
            System.out.println("Email is Invalid--!!");
        }
    }
}