package template_method;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:51
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        AbsComputer computer = new ConcreteComputer();
        computer.startUp();
    }
}
