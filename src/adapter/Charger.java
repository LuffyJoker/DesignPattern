package adapter;

/**
 * @author Mr.Q
 * @date 2020/3/26 23:29
 * desc：充电器（适配器）
 */
public class Charger extends ElectricalSource implements Phone {
    @Override
    public int getVolt5() {
        System.out.println("电源电压为： " + getVolt220());
        System.out.println("通过 Charger 进行电压转换，将电压转换 5v");
        // 经过转换后的结果
        return 5;
    }
}
