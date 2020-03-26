package interator_diedai;

/**
 * @author Mr.Q
 * @date 2020/3/26 21:34
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("a");
        a.add("b");
        a.add("c");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
