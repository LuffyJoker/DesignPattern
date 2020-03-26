package observer;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:09
 * desc：
 * 观察者模式，使用 JDK 内置的类型实现
 * Observable、Observer 是 JDK 的内置实现
 */
public class Test {
    public static void main(String[] args) {

        // 具体的被观察者
        ConcreteObservable concreteObservable = new ConcreteObservable();

        // 具体的观察者
        ConcreteObserver concreteObserver = new ConcreteObserver();

        // 观察者 订阅 被观察者
        concreteObservable.addObserver(concreteObserver);

        concreteObservable.publishMsg("被观察发布事件");
    }
}
