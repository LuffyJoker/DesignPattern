package command;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:39
 * desc：命令接受者
 */
public class Receiver {

    /**
     * 命令接受者，接到命令后所执行的动作
     */
    public void action() {
        System.out.println("命令接受者，执行具体的命令");
    }
}
