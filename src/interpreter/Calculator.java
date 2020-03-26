package interpreter;

import java.util.Stack;

/**
 * @author Mr.Q
 * @date 2020/3/26 17:52
 * desc：
 */
public class Calculator {

    // 用于存储并操作所有相关的解释器
    private Stack<ArithmeticInterpreter> stack = new Stack<>();

    public Calculator(String expression) {

        // 用于存储操作符两边的操作数
        ArithmeticInterpreter expression1, expression2;

        // 分割表达式
        String[] elements = expression.split(" ");

        // 利用 Stack 的数据结构，构建一个计算的语法树
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    // 取出栈中解释器，并作为操作符左边的解释器
                    expression1 = stack.pop();
                    expression2 = new NumInterpreter(Integer.valueOf(elements[++i]));
                    stack.push(new AdditionInterpreter(expression1, expression2));
                    break;
                default:
                    stack.push(new NumInterpreter(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculator() {
        return stack.pop().interpreter();
    }
}
