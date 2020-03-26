package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:16
 * desc：中介者模式，顶层父类。中介者：用于协调多个对象之间的交互，change 方法，就是切换对象的操作
 */
public abstract class Mediator {
    /**
     * 切换事件的处理对象
     *
     * @param colleague
     */
    abstract void changed(Colleague colleague);
}
