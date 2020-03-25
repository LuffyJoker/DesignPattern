package state;

/**
 * @author Mr.Q
 * @date 2020/3/25 17:27
 * desc：Tv 的开机状态，此时，只有开机功能是无效的
 */
public class PowerONState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
