package homework_2709;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        String message = "евирпим, тр";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < message.length(); i++) {
            stack.push(message.charAt(i));            // один из вариантов это доставать символы по индексу через метод charAt
        }
//        stack.push("е");                           // второй вариант, это добавить в стек все буквы шифра, и потом доставать из стека в обратном порядке, но не совсем получилось
//        stack.push("в");
//        stack.push("и");
//        stack.push("р");
//        stack.push("п");
//        stack.push("и");
//        stack.push("м");
//        stack.push(",");
//        stack.push("т");
//        stack.push("р");


        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
