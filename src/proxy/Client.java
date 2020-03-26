package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:53
 * desc：
 */
public class Client {
    public static void main(String[] args) {

        // 静态代理使用
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.visit();

        // 动态代理使用
        RealSubject realSubject1 = new RealSubject();
        InvocationHandler dynamicProxy = new DynamicProxy(realSubject1);
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), dynamicProxy);
        subject.visit();
    }
}
