package myproject;

import java.util.Scanner;

public class BillPay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter Jay amount:");
        int jay = sc.nextInt();

        System.out.println("Enter Viru amount:");
        int viru = sc.nextInt();

        if (jay > viru) {
            System.out.println("Jay will pay the bill");
        }
        else {
            System.out.println("Viru will pay the bill");
        }

        sc.close(); 

	}

}


// Output
//   Enter Jay amount:
// 87
// Enter Viru amount:
// 23
// Jay will pay the bill
