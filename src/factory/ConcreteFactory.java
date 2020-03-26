package factory;

/**
 * @author Mr.Q
 * @date 2020/3/25 16:21
 * desc：具体的工厂，例如，生产产品 A
 */
public class ConcreteFactory extends AbsFactory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
