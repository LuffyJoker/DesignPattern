package interpreter;

/**
 * @author Mr.Q
 * @date 2020/3/26 17:46
 * desc：抽象的操作符解释器，因为操作符可能会存在多种，每一个操作符都对应一个解释器
 */
public abstract class OperatorInterpreter extends ArithmeticInterpreter {

    protected ArithmeticInterpreter expression1, expression2;

    public OperatorInterpreter(ArithmeticInterpreter expression1, ArithmeticInterpreter expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
