package iterator;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:19
 * desc：组长
 */
public class GroupLeader extends Leader {

    @Override
    public int limit() {
        System.out.println("组长能处理的最大额度为 1000");
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销" + money + "元");
    }
}
