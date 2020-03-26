package visitor;

import java.util.Random;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:56
 * desc：工程师类
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        // 将被访问者传递给访问者，然后即可在访问者中访问被访问对象
        visitor.visit(this);
    }

    /**
     * 获取工程师一年写的代码量
     *
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }

}
