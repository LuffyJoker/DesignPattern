package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:19
 * desc：事件的发起者，发起事件后，由具体的中介者来处理这个问题
 */
public class CDDevice extends Colleague {

    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据，音频数据";
        mediator.changed(this);
    }
}
