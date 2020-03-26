package iterator;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:13
 * desc：责任链的顶端，作为一个抽象类，定义了责任链中，定义了处理事件的方法，并且根据条件，决定由自己处理，还是他的下一级去处理事件
 * 这是的事件处理，类似于 Android 的事件分发机制，如果自己能处理这个事件，就自己处理，否则就调用下一个处理者去处理
 */
public abstract class Leader {

    protected Leader nextHandler;

    /**
     * 处理事件
     *
     * @param money
     */
    public final void handleRequest(int money) {

        // 在此处判断当前的事件处理者能否处理这个事件
        if (money < limit()) {
            handle(money);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(money);
            }
        }
    }

    /**
     * 自己处理该事件的范围
     *
     * @return
     */
    public abstract int limit();

    /**
     * 处理事件的方式
     *
     * @param money
     */
    public abstract void handle(int money);
}
