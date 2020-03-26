package iterator;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:19
 * desc：经理
 */
public class Manager extends Leader {

    @Override
    public int limit() {
        System.out.println("经理能处理的最大额度为 100000");
        return 100000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销" + money + "元");
    }
}
