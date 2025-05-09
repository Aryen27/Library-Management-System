package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int menu() {
        System.out.println("Enter your choice");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("0. EXIT");
        System.out.println("1. Add Book");
        System.out.println("4. Update Book");
        System.out.println("5. Display all books in library");
        System.out.println("6. Display all avaiable books in library");
        System.out.println("-----------------------------------------------------------------");
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        while((choice=menu())!=0) {
        }
    }
}