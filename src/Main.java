import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operand2;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input operand");
        int operand1 = scanner.nextInt();
        do {
            System.out.println("Input operation");
            operation = scanner.next().charAt(0);


            switch (operation) {
                case '+':
                    System.out.println("Input operand");
                    operand2 = scanner.nextInt();
                    operand1 += operand2;
                    System.out.println(operand1);
                    break;
                case '-':
                    System.out.println("Input operand");
                    operand2 = scanner.nextInt();
                    operand1 -= operand2;
                    System.out.println(operand1);
                    break;
                case '/':
                    System.out.println("Input operand");
                    operand2 = scanner.nextInt();
                    operand1 /= operand2;
                    System.out.println(operand1);
                    break;
                case '*':
                    System.out.println("Input operand");
                    operand2 = scanner.nextInt();
                    operand1 *= operand2;
                    System.out.println(operand1);
                    break;
                case 'C':
                    operand1 = 0;
                    System.out.println(operand1);
                    System.out.println("Input operand");
                    operand1 = scanner.nextInt();
                    break;
                case 's':
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("use +, -, *, /, C - clear, s - quit bug_fix");
                    break;
            }
        } while (operation != 's');

    }
}