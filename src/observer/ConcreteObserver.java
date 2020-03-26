package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:05
 * desc：具体的观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("被观察者发生变化，在此处收到消息: " + arg);
    }
}
