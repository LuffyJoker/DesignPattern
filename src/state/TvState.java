package state;

/**
 * @author Mr.Q
 * @date 2020/3/25 17:26
 * desc：该接口用于定义 Tv 的当前状态，并且在这个状态下所能执行的操作
 */
public interface TvState {

    public void nextChannel();

    public void prevChannel();

    public void turnUp();

    public void turnDown();
}
