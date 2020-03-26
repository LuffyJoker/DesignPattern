package factory;

/**
 * @author Mr.Q
 * @date 2020/3/25 16:15
 * desc：简单工厂模式，直接生产对象，根据类型来产生不同的对象
 */
public class SimpleFactory {
    public static final int PRODUCT_TYPE = 1;    // 产品类型

    public static Product createProduct(int type) {
        switch (type) {
            case PRODUCT_TYPE:
                return new ConcreteProductA(); // 实现类
            default:
                return new ConcreteProductB();
        }
    }
}
