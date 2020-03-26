package proxy;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:51
 * desc：静态代理类
 */
public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        System.out.println("代理人，可以增强被代理人的功能");
        realSubject.visit();
    }
}
