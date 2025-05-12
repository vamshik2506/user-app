package com.userapp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username:");
        String username = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Phone:");
        String phone = scanner.nextLine();

        try (FileWriter writer = new FileWriter("users.txt", true)) {
            writer.write("Username: " + username + ", Email: " + email + ", Phone: " + phone + "\n");
            System.out.println("User info saved.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        scanner.close();
    }
}
