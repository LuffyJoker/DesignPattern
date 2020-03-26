package memorandum;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:45
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.play();
        Caretaker caretaker = new Caretaker();

        // 创建备忘录，进行存档
        caretaker.archive(originator.createMemoto());

        originator.exit();

        Originator newOriginator = new Originator();

        // 获取备忘录，恢复游戏数据
        newOriginator.restore(caretaker.memoto());
    }
}
