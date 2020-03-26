package adapter;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:36
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        Charger charger = new Charger();
        System.out.println("输出电压为： " + charger.getVolt5());
    }

}
