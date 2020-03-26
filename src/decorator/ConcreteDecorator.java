package decorator;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:43
 * desc：具体的装饰者
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operatorA();
        super.operate();
        operatorB();
    }

    public void operatorA() {
        // 装饰方法逻辑
    }

    public void operatorB() {
        // 装饰方法逻辑
    }
}
