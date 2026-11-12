
package com.demo;

public class App {

    public static String getMessage() {
        return "Hello! Maven Build Successful. AWS SES CI/CD Pipeline Working!";
    }

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       MAVEN CI/CD PROJECT      ");
        System.out.println("================================");

        System.out.println(getMessage());

        System.out.println("Build and execution completed!");
    }
}
