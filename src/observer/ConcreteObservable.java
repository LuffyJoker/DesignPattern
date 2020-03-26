package observer;

import java.util.Observable;

/**
 * @author Mr.Q
 * @date 2020/3/26 19:06
 * desc：具体的被观察者
 */
public class ConcreteObservable extends Observable {

    /**
     * 被观察者发送事件
     *
     * @param content
     */
    public void publishMsg(String content) {
        /**
         * 标识状态或者内容发生变化
         */
        setChanged();

        /**
         * 通知所有观察者
         */
        notifyObservers(content);
    }
}
