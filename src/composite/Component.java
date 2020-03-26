package composite;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:13
 * desc： 组合模式：顶层抽象父类。下面两类子类，一个是组合类，一个是具体的组件类
 */
public abstract class Component {

    // 子节点的名称
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 由子组件去实现响应的功能
     */
    public abstract void doSomething();

}
