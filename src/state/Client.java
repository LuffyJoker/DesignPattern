package state;

/**
 * @author Mr.Q
 * @date 2020/3/25 17:35
 * desc：
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.prevChannel();
        tvController.powerOff();
        tvController.turnUp(); // 这个动作没有有任何操作
    }
}
