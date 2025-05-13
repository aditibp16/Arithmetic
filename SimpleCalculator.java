public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10; // Example first number
        double num2 = 5;  // Example second number
        char operator = '+'; // Example operator

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
