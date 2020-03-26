package mediator;

/**
 * @author Mr.Q
 * @date 2020/3/26 22:25
 * desc：
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频： " + data);
    }
}
