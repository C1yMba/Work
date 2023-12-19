import java.util.Stack;
public class Main {
    public static void main(String[] args) {
                StackCalculator calculator = new StackCalculator();
                // Пример выражения в ОПН
                String expression = "2 7 + 9 * 10 - 2 8 9 - * +";
                System.out.println("Result: " + calculator.calculate(expression));
            }
        }
