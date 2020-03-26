package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:54
 * desc：动态代理，看代码结构即可
 */
public class DynamicProxy implements InvocationHandler {

    private RealSubject realSubject;

    public DynamicProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始，这里也是代理增强，即可以增加功能的地方： " + this.getClass().getSimpleName());
        method.invoke(realSubject, args);
        System.out.println("动态代理结束");
        return null;
    }
}
