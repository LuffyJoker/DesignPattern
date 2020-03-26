package iterator;

/**
 * @author Mr.Q
 * @date 2020/3/26 18:22
 * desc：客户端使用责任链模式
 */
public class Client {
    public static void main(String[] args) {

        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();

        // 设置事件的下一任处理者
        groupLeader.nextHandler = director;
        director.nextHandler = manager;

        groupLeader.handleRequest(50000);
    }
}
