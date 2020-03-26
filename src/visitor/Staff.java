package visitor;

import java.util.Random;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:56
 * desc：被访问者。抽象员工类，作为被访问对象，其 accept 方法用于接受访问者
 */
public abstract class Staff {

    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    /**
     * 接受 visitor 的访问
     */
    public abstract void accept(Visitor visitor);
}
