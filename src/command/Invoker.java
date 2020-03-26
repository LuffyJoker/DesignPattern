package command;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:48
 * desc：命令的请求者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
