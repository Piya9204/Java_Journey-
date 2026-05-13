package methodprogram;

public class Calculator {

    // method for addition
    int addNumbers(int n1, int n2, int n3) {

        int sum = n1 + n2 + n3;
        return sum;
    }

    // method for average
    void findAverage(int a, int b, int c) {

        int result = addNumbers(a, b, c);

        int average = result / 3;

        System.out.println("Average is: " + average);
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        int total = c1.addNumbers(10, 20, 30);

        System.out.println("Sum is: " + total);

        c1.findAverage(10, 20, 30);
    }
}

//Output:
// Sum is: 60
// Average is: 20
