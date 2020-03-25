package state;

/**
 * @author Mr.Q
 * @date 2020/3/25 17:27
 * desc：Tv 的关机状态，此时，只有开机功能是有效的
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
