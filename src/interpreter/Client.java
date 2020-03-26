package interpreter;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:04
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("153 + 3589 + 118 + 555");
        System.out.println(calculator.calculator());
    }
}
