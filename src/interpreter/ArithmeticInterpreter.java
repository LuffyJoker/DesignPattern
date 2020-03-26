package interpreter;

/**
 * @author Mr.Q
 * @date 2020/3/26 17:39
 * desc：解释器模式，解释规则抽象类
 * 一个操作符对应一个解释器，即将该操作符解释为对应的操作，例：A ——> B (将 A 解释 B)
 */
public abstract class ArithmeticInterpreter {
    /**
     * 解析方法，具体的解析逻辑由子类去实现
     *
     * @return
     */
    public abstract int interpreter();
}
