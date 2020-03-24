package single;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:01
 * desc：单例模式：恶汉式实现，线程不安全
 */
public class SingleEH {

    private static final SingleEH mInstance = new SingleEH();

    private SingleEH() {
    }

    public static SingleEH getInstance() {
        return mInstance;
    }

    /**
     * 反序列化时,如果定义了readResolve()，则直接返回此方法指定的对象，而不需要单独再创建新对象！
     * @return
     */
    private Object readResolve() {
        return mInstance;
    }
}
