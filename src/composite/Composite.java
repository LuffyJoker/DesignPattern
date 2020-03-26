package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:15
 * desc：组合类：用于把具体的组件组合在一起使用，用于管理子节点
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("组合类的名称： " + name);
        if (list != null) {
            for (Component component : list) {
                component.doSomething();
            }
        }
    }

    /**
     * 添加子节点
     *
     * @param child
     */
    public void addChild(Component child) {
        list.add(child);
    }

    /**
     * 删除子节点
     *
     * @param child
     */
    public void removeChild(Component child) {
        list.remove(child);
    }

    /**
     * 获取子节点
     *
     * @param index
     * @return
     */
    public Component getChild(int index) {
        return list.get(index);
    }
}
