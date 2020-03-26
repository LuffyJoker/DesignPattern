package composite;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:22
 * desc：
 */
public class Client {
    public static void main(String[] args) {

        // 根节点
        Composite root = new Composite("Root");

        // 分支节点
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");

        // 叶子节点
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}
