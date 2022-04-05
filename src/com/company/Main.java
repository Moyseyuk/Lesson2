package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = null;
        System.out.println("Хто я?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
	    System.out.println("Hello " + name + "!");
    }
}
