package interpreter;

/**
 * @author Mr.Q
 * @date 2020/3/26 17:50
 * desc：+ 操作的解释器，获取操作数解释器的解释结果，进行加法运算
 */
public class AdditionInterpreter extends OperatorInterpreter {

    public AdditionInterpreter(ArithmeticInterpreter expression1, ArithmeticInterpreter expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpreter() {
        return expression1.interpreter() + expression2.interpreter();
    }
}
