package factory;

/**
 * @author Mr.Q
 * @date 2020/3/25 16:19
 * desc：抽象工厂，具体生产什么，由具体的工厂决定
 */
public abstract class AbsFactory {

    // 将创建对象的方法抽象化，由具体的工厂去实现
    public abstract Product createProduct();

    // 通过反射去创建对象
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
