package iterator;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:19
 * desc：主管
 */
public class Director extends Leader {

    @Override
    public int limit() {
        System.out.println("主管能处理的最大额度为 5000");
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管批复报销" + money + "元");
    }
}
