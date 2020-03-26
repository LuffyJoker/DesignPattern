package proxy;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:50
 * desc：
 */
public class RealSubject implements Subject {

    @Override
    public void visit() {
        System.out.println("真正做事的人");
    }
}
