package command;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:41
 * desc：具体的命令
 */
public class ConcreteCommand implements Command {

    /**
     * 命令，需要持有一个命令接受者，用于执行具体的命令
     */
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
