package interator_diedai;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:32
 * desc：聚合迭代器的具体实现类
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
