package state;

/**
 * @author Mr.Q
 * @date 2020/3/25 17:32
 * desc：
 */
public class TvController implements PowerController {

    public TvState tvState;

    public void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerONState());
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerONState());
        System.out.println("关机");
    }

    public void nextChannel() {
        tvState.nextChannel();
    }

    public void prevChannel() {
        tvState.prevChannel();
    }

    public void turnUp() {
        tvState.turnUp();
    }

    public void turnDown() {
        tvState.turnDown();
    }
}
