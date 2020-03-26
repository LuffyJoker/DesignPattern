package command;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:48
 * desc：
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
