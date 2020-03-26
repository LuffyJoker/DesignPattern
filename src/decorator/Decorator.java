package decorator;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:42
 * desc：装饰者
 */
public abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
