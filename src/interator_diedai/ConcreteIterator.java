package interator_diedai;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:27
 * desc：具体的迭代器，持有需要迭代的集合
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (hasNext()) {
            obj = list.get(cursor++);
        }
        return obj;
    }
}
