//3. Basic calculator
class test{
    int num1;
    int num2;
    int choice;
    int result;

    int calc(){
        if (choice == 1) {
            result = num1 + num2;
        } else if (choice == 2) {
            result = num1 - num2;
        } else if (choice == 3) {
            result = num1 * num2;
        } else if (choice == 4) {
            result = num1 / num2;
        } else {
            System.out.println("Invalid choice");
        } 
        return result;
    }
    public static void main(String[] args) {
        test t = new test();

        t.num1 = 20;
        t.num2 = 10;
        t.choice = 1;

        System.out.println("Result = " + t.calc());
    }
}