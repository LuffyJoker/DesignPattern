package interator_diedai;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:25
 * desc：迭代器
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素，true：有  false：无
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素，并将位置移至下一个位置
     *
     * @return
     */
    T next();
}
