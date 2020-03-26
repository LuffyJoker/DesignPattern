package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:17
 * desc：
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
