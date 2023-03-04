import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter a command:");
        while (true) {
            Scanner in = new Scanner(System.in);
            Scanner line = new Scanner(in.nextLine());
            String command = line.next();
            int leftOperand;
            int rightOperand;
            switch (command) {
                case "add":
                    leftOperand = line.nextInt();
                    rightOperand = line.nextInt();
                    System.out.println(calculator.add(leftOperand, rightOperand));
                    break;
                case "subtract":
                    leftOperand = line.nextInt();
                    rightOperand = line.nextInt();
                    System.out.println(calculator.subtract(leftOperand, rightOperand));
                    break;
                case "multiply":
                    leftOperand = line.nextInt();
                    rightOperand = line.nextInt();
                    System.out.println(calculator.multiply(leftOperand, rightOperand));
                    break;
                case "divide":
                    leftOperand = line.nextInt();
                    rightOperand = line.nextInt();
                    System.out.println(calculator.divide(leftOperand, rightOperand));
                    break;
                case "fibonacci": {
                    int num = line.nextInt();
                    System.out.println(calculator.fibonacciNumberFinder(num));
                    break;
                }
                case "binary": {
                    int num = line.nextInt();
                    System.out.println(calculator.intToBinaryNumber(num));
                    break;
                }
                case "exit": {
                    return;
                }
            }
        }
    }
}
