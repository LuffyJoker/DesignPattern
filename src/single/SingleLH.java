package single;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:03
 * desc：懒汉模式实现单例，线程安全，但效率不高
 */
public class SingleLH {
    private static SingleLH mInstance;

    private SingleLH() {
    }

    public static synchronized SingleLH getInstance() {
        if (mInstance == null) {
            mInstance = new SingleLH();
        }
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
