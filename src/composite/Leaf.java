package composite;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:21
 * desc：叶子节点
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("叶子节点的名称： " + name);
    }
}
