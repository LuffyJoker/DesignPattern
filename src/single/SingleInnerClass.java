package single;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:11
 * desc：使用静态内部类的方式实现单例，推荐使用
 * getInstance 调用，会导致 SingletonHolder 被装载，而类的装载是线程安全的且只会执行一次。
 * 达到了 lazy loading 的效果，线程安全
 */
public class SingleInnerClass {

    private SingleInnerClass() {

    }

    /**
     * 使用静态内部类，可以延时加载
     */
    private static class SingletonHolder {
        private final static SingleInnerClass mInstance = new SingleInnerClass();
    }

    public static SingleInnerClass getInstance() {
        return SingletonHolder.mInstance;
    }
}
