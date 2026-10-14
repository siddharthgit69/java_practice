import java.util.Scanner;

class test {
    int num1;
    int num2;
    int choice;
    int result;

    int calc() {
        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid choice");
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        test t = new test();

        System.out.print("Enter first number: ");
        t.num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        t.num2 = sc.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice: ");
        t.choice = sc.nextInt();

        int answer = t.calc();

        if (t.choice >= 1 && t.choice <= 4
                && !(t.choice == 4 && t.num2 == 0)) {
            System.out.println("Result = " + answer);
        }

        sc.close();
    }
}