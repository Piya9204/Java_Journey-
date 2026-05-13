package liecence;

import java.util.Scanner;

public class RTOLiecenceprtal {

	public static void main(String[] args) {
	

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pune RTO Licence Portal ===");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            if (age > 75) {
                System.out.println("NOT Eligible! Age limit exceeded (above 75).");
            } else {
                System.out.println("Eligible for Driving Licence!");
            }

        } else {
            int yearsLeft = 18 - age;
            System.out.println("NOT Eligible! Wait for " + yearsLeft + " years for licence.");
        }

         
	}

}


// OUTPUT: 
// === Pune RTO Licence Portal ===
// Enter your age: 23
// Eligible for Driving Licence!

// === Pune RTO Licence Portal ===
// Enter your age: 14
// NOT Eligible! Wait for 4 years for licence.
// === Pune RTO Licence Portal ===
// Enter your age: 80
// NOT Eligible! Age limit exceeded (above 75).
