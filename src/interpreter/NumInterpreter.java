package interpreter;

/**
 * @author Mr.Q
 * @date 2020/3/26 17:46
 * desc：操作数的解释器
 */
public class NumInterpreter extends ArithmeticInterpreter {

    private int num;

    public NumInterpreter(int num) {
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }
}
