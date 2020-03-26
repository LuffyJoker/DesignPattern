package interator_diedai;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:30
 * desc：聚合迭代器的抽象类，即迭代器的容器
 */
public interface Aggregate<T> {

    /**
     * 添加一个元素
     *
     * @param t
     */
    void add(T t);

    /**
     * 删除一个元素
     *
     * @param t
     */
    void remove(T t);

    /**
     * 获取迭代器对象
     *
     * @return
     */
    Iterator<T> iterator();
}
