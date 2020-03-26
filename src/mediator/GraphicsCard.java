package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:24
 * desc：
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data) {
        System.out.println("视频: " + data);
    }
}
