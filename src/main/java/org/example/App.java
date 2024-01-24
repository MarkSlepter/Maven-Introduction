package org.example;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }

}
