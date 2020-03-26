package factory;

/**
 * @author Mr.Q
 * @date 2020/3/25 16:22
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        // 此处具体的工厂类生产的是 A 商品
        AbsFactory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }
}
