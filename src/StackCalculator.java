import java.util.Stack;

public class StackCalculator {

    public double calculate(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { // проверка, является ли токен числом
                stack.push(Double.parseDouble(token));
            } else {
                double a = stack.pop();
                double b = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                    // можно добавить больше операторов
                }
            }
        }

        return stack.pop();
    }
}
