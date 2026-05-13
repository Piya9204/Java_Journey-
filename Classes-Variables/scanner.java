package scannerprogram;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        // printing output
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);

        sc.close();
    }
}

// Enter your name:
// alfiya
// Enter your age:
// 22
// Student Name: alfiya
// Student Age: 22
