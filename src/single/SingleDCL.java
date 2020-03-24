package single;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:05
 * desc：使用 Double check Lock 的方式实现单例，效率高，推荐使用
 */
public class SingleDCL {

    private static volatile SingleDCL mInstance;

    private SingleDCL() {
    }

    /**
     * new 一个对象。1、分配内存 2、调用构造函数，初始化成员字段 3、instance 指向分配的内存空间
     * 上面 2 3 由于 JVM 指令优化，可能执行顺序不定，如果 3 先执行，那么，instance 就不为空
     * 此时，另一个线程执行第一个判断，那么，就会返回一个空的对象
     * 所以，需要将 instance 申明为 volatile 类型，目的是为了防止 JVM 优化指令（即指令重排）
     *
     * @return
     */
    public static SingleDCL getInstance() {
        if (mInstance == null) {
            synchronized (SingleDCL.class) {
                if (mInstance == null) {
                    mInstance = new SingleDCL();
                }
            }
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
